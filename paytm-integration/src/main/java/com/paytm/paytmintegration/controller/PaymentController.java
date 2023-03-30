package com.paytm.paytmintegration.controller;

import java.net.URL;
import java.util.Map;
import java.util.Random;

import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.paytm.paytmintegration.AppConfig;
import com.paytm.pg.merchant.PaytmChecksum;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	Random random = new Random();

	//initiates transaction
	
	@PostMapping("/start")
	public Map<String, Object> startPayment(@RequestBody Map<String, Object> data) {

		String orderId = "ORDER" + random.nextInt(10000000);

		// param created
		JSONObject paytmParams = new JSONObject();

		// body information
		JSONObject body = new JSONObject();
		body.put("requestType", "Payment");
		body.put("mid", AppConfig.MID);
		body.put("websiteName", AppConfig.WEBSITE);
		body.put("orderId", orderId);
		//if payment is successful automatically this url gets called
		body.put("callbackUrl", "http://localhost:8080/payment-success");

		JSONObject txnAmount = new JSONObject();
		txnAmount.put("value", data.get("amount"));
		txnAmount.put("currency", "INR");

		JSONObject userInfo = new JSONObject();
		userInfo.put("custId", "CUST_001");

		body.put("txnAmount", txnAmount);
		body.put("userInfo", userInfo);

		String responseData = "";
		ResponseEntity<Map> response = null;

		String checksum;
		try {
			checksum = PaytmChecksum.generateSignature(body.toString(), AppConfig.MKEY);

			JSONObject head = new JSONObject();
			head.put("signature", checksum);

			paytmParams.put("body", body);
			paytmParams.put("head", head);

			String post_data = paytmParams.toString();

			//above data we are sending on paytm server using below url
			URL url = new URL("https://securegw-stage.paytm.in/theia/api/v1/initiateTransaction?mid=" + AppConfig.MID
					+ "&orderId=" + orderId + "");

			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<Map<String, Object>> httpEntity = new HttpEntity<>(paytmParams.toMap(), headers);

			// calling api
			RestTemplate restTemplate = new RestTemplate();
			response = restTemplate.postForEntity(url.toString(), httpEntity, Map.class);

			System.out.println(response);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		 Map body1 = response.getBody();
	        body1.put("orderId", orderId);
	        body1.put("amount", txnAmount.get("value"));
	        return body1;

	}
	
}
