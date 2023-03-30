package array;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number upto 20---->");
		fibo(sc.nextInt());
	}
	public static void fibo(int n) {
		int m1=0;
		int m2=1;
		int m3;
		for (int i = 1; i <=n; i++) {
			m3=m1+m2;
			m1=m2;
			m2=m3;
			System.out.println(m1);
		}
	}
}
