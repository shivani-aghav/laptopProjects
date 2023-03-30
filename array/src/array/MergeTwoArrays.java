package array;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30 };
		int[] b = { 40, 50, 60, 70 };
		int a_length = a.length;
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[a.length+i] = b[i];
		}
		System.out.println(Arrays.toString(c));
	}
}
