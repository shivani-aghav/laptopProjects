

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringDuplicatesUsingStream {

	public static void main(String[] args) {
		String s = "mermaaid";
		char[] c = s.toCharArray();
		/*
		 * for (int i = 0; i < c.length; i++) { for (int j = i + 1; j < c.length - 1;
		 * j++) { if (c[i] == c[j]) { System.out.println(c[i]); } } }
		 */

		Arrays.stream(s.split("")).collect(Collectors.groupingBy(t -> t)).entrySet().forEach(t -> {
			if (t.getValue().size() > 1) {
				System.out.println(t.getKey());
			}
		});
	}
}
