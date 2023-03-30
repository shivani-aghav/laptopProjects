package array;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * int[] a = { 2, 1, 3, 4, 5, 2, 5, 6 }; for (int i = 0; i < a.length; i++) {
		 * for (int j = i + 1; j < a.length - 1; j++) { if (a[i] == a[j]) { for (int j2
		 * = j; j2 < a.length - 1; j2++) { a[j] = a[j + 1]; } } } } for (int i = 0; i <
		 * a.length - 1; i++) { System.out.println(a[i]); }
		 */

		List<Integer> list = Arrays.asList(10, 60, 40, 30, 50, 30, 20, 50, 60, 80, 90, 70, 80);
		list.stream().sorted().distinct().collect(Collectors.toList()).forEach(System.out::println);

	}
}
