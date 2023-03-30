package array;

import java.util.Arrays;
import java.util.stream.Collectors;

//if any element is more than length/2 then it is majority else return -1
public class NBy2MajorityElement {

	public static void main(String[] args) {
		int[] n = { 2, 3, 4, 5, 2, 3, 3, 3, 3 };
//		Arrays.stream(n).map(t -> t).boxed().collect(Collectors.groupingBy(t -> t)).entrySet()
//		.parallelStream().filter(t -> t.getValue()>n.length/2).collect(Collectors.toList());

		Arrays.stream(n).boxed().collect(Collectors.groupingBy(t -> t)).entrySet().forEach(x -> {
			if (x.getValue().size() > n.length / 2)
				System.out.println(x.getKey());

		});

		/*
		 * int big=n[0]; for (int i = 0; i < n.length; i++) { if(n[i]>big) { big=n[i]; }
		 * }
		 * 
		 * int[] arr=new int[big+1]; for (int i = 0; i < n.length; i++) { arr[n[i]]++; }
		 * for (int i = 0; i < arr.length; i++) { if(arr[i]>1)
		 * System.out.println(i+"--->"+arr[i]+" times"); }
		 */

	}
}
