package array;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array :");
		int size = sc.nextInt();
		int n[] = new int[size];
		System.out.println("ent"
				+ "er " + size + " values :");
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		float sum = 0;
		for (int i = 0; i < n.length; i++) {
			sum = sum + n[i];
		}
		float avg = sum / size;
		if (avg != 0) {
			System.out.println("average is : "+avg);
		}

	}
}
