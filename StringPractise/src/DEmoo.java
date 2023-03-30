import java.util.ArrayList;
import java.util.Arrays;

public class DEmoo {

	public static void main(String[] args) {
		int []a= {1,2,3,6,5,4};
		int tmp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					tmp=a[j];
					a[j]=a[i];
					a[i]=tmp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
