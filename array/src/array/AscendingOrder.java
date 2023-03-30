package array;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		int[] a = { 4, 6, 3, 9 };
		int tmp = 0;//3 4 9 6 
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
