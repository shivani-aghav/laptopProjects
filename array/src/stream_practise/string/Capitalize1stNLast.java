package stream_practise.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Capitalize1stNLast {

	public static void main(String[] args) {
		String s = "shivani aghav";

		// First letter capitalized
		Stream.of(s.split(" ")).map(t -> t.substring(0, 1).toUpperCase() + t.substring(1) + " ")
				.forEach(System.out::print);

		System.out.println();

		// Last letter capitalized
		Stream.of(s.split(" "))
				.map(t -> t.substring(0, t.length() - 1) + (t.substring(t.length() - 1).toUpperCase() + " "))
				.forEach(System.out::print);

		System.out.println();

		// First and Last capitalized
		Stream.of(s.split(" ")).map(t -> t.substring(0, 1).toUpperCase() + t.substring(1, t.length() - 1)
				+ t.substring(t.length() - 1).toUpperCase() + " ").forEach(System.out::print);

		System.out.println();

		// if it is array or arraylist
		String s1[] = { "gobi", "palak", "methi" };
		List<String> asList = Arrays.asList("gobi", "palak", "methi");
		
		Arrays.stream(s1).map(t -> t.substring(0, 1).toUpperCase() + t.substring(1, t.length() - 1)
				+ t.substring(t.length() - 1).toUpperCase() + " ").forEach(System.out::print);

		asList.stream().map(t -> t.substring(0, 1).toUpperCase() + t.substring(1, t.length() - 1)
				+ t.substring(t.length() - 1).toUpperCase() + " ").forEach(System.out::print);
	}
}
