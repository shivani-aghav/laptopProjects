package array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractise {

	public static void main(String[] args) {
		// iterate()
		Stream.iterate(10, n -> n * 2).limit(10).forEach(System.out::println);
		System.out.println("----------------------------------");

		// builder()
		Stream.builder().add("Kavya").add(20).build().forEach(System.out::println);
		System.out.println("----------------------------------");

		// filter()
		Arrays.asList("Saumya", "Mereline", null, "Baburao", "Bhishma", null).stream()
				.filter(t -> t != null && t.startsWith("B")).forEach(System.out::println);
		System.out.println("----------------------------------");

		// sorting type 1
		List<Integer> sor = Arrays.asList(4, 3, 6, 7, 8, 5, 2, 1);
		sor.stream().sorted(Comparator.comparing(Integer::intValue).reversed()).forEach(System.out::println);
		System.out.println();
		sor.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("----------------------------------");

		//sorting type 2
		int[] f = { 60, 40, 20, 10, 30, 50, 70 };
		IntStream.of(f).boxed().sorted(Comparator.comparing(Integer::intValue).reversed()).forEach(System.out::println);
		System.out.println();
		IntStream.of(f).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("----------------------------------");
		
		//sorting string
		List<String> asList = Arrays.asList("Majnu","Jeetu","Purva","Laila","Sumedha","Bhavya");
		asList.stream().sorted().forEach(System.out::println);
		System.out.println();
		asList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("----------------------------------");

	}
}
