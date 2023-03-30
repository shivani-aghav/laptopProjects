package array;

import java.util.Scanner;

public class InsertElementToArrayIn3rdPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array--->");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("enter values--->");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
//	System.out.println(Arrays.toString(arr));
		System.out.println("enter the position to insert element");
		int pos = sc.nextInt();

		System.out.println("enter element to be inserted---->");
		int element = sc.nextInt();

		for (int i = arr.length - 1; i > pos - 1; i--) {
			arr[i] = arr[i - 1];
		}

		arr[pos - 1] = element;

//		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

//		int[] arr= {10,20,30,40,50,60};
//		int pos=3;
//		int element=100;
//		for (int i = arr.length-1; i >pos-1; i--) {
//			arr[i]=arr[i-1];
//		}
//		arr[2]=element;
//		for (int i : arr) {
//			System.out.println(i);
//		}
	}
}
