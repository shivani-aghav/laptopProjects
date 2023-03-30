package array;

import java.util.Scanner;

public class DeleteElementFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array--->");
		int size = sc.nextInt();
		int[]a=new int[size];
		System.out.println("enter elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter element to be deleted from array");
		int delete = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (delete==a[i]) {
				for (int j = i; j < a.length-1; j++) {
					a[j]=a[j+1];
				}
				break;
			}
		}
		for (int i = 0; i < a.length-1; i++) {
			System.out.println(a[i]);
		}
		
		
		
		
//		int[] a = { 10, 20, 30, 40, 50 };
//		int delete=30;
//		for (int i = 0; i < a.length; i++) {
//            if (delete==a[i]) {
//				for (int j = i; j < a.length-1; j++) {
//					a[j]=a[j+1];
//				}
//				break;
//			}
//		}
//		for (int i = 0; i < a.length-1; i++) {
//			System.out.println(a[i]);
//		}
	}
}
