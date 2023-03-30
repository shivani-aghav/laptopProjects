package array;

public class FindDuplicates {

	public static void main(String[] args) {
		int []a= {2,1,3,4,5,2,5,6};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length-1; j++) {
				if (a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
