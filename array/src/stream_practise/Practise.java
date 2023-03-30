package stream_practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practise {

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

		// list to map or occurence of elements if done .entryset() it will convert into set
		Arrays.asList(5, 3, 2, 3, 4, 2, 1, 2, 6, 7).stream()
				.collect(Collectors.groupingBy(t -> t, Collectors.counting())).entrySet().forEach(System.out::println);
		;
		System.out.println("----------------------------------");

		// Occurrence of elements in string
		String s = "shivaanii";
		Stream.of(s.toCharArray());
		s.chars().mapToObj(t -> (char) t).collect(Collectors.groupingBy(t -> t, Collectors.counting())).entrySet()
				.forEach(System.out::println);
		System.out.println("----------------------------------");

		// printing duplicates in string
		String f = "mermaaiidd";
		Arrays.asList(f.split("")).stream().collect(Collectors.groupingBy(t -> t)).entrySet().forEach(t -> {
			if (t.getValue().size() > 1) {
				System.out.println(t.getKey());
			}
		});
		System.out.println("----------------------------------");

		// anyMatch() allMatch() noneMatch()
		List<String> list = Arrays.asList("Java", "Python", "Ruby", "Sql", "C++", "AdvanceJava", "Java", "Python");
		boolean anyMatch = list.stream().anyMatch(t -> t.startsWith("Java"));
		boolean anyMatch1 = list.stream().allMatch(t -> t.startsWith("C++"));
		boolean anyMatch2 = list.stream().noneMatch(t -> t.startsWith("Hql"));
		System.out.println(anyMatch);
		System.out.println(anyMatch1);
		System.out.println(anyMatch2);
		System.out.println("----------------------------------");

		// max() min() in ArrayList
		List<Integer> a = Arrays.asList(23, 55, 33, 87, 54, 23, 98, 59);
		a.stream().max(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);
		a.stream().min(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);
		System.out.println("----------------------------------");

		//max() min() in Array
		int[] a1 = { 6, 5, 4, 7, 8, 9, 3, 4, 2, 1, 7 };
		IntStream.of(a1).boxed().max(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);
		IntStream.of(a1).boxed().min(Comparator.comparing(Integer::intValue)).ifPresent(System.out::println);
		System.out.println("----------------------------------");
		
		//max() min() in String (alphabetically)
		List<String> asList = Arrays.asList("Pavni","Soumya","Devki","Dev","Rajubai","Lokii","John");
		asList.stream().max(Comparator.comparing(String::valueOf)).ifPresent(System.out::println);
	}
}
