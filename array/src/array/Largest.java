package array;

public class Largest {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 60, 50, 40, 70, 60 };
		int max=a[0];
		for (int i = 1; i < a.length; i++) {
			if (max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
	} 
}
