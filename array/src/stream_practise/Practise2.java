package stream_practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Practise2 {

	public static void main(String[] args) {

		// Factorial using reduce()
		IntStream.range(1, 6).reduce((a, b) -> a * b).ifPresent(System.out::println);
		System.out.println("----------------------------------");

		//getting higher length string
		List<String> list = Arrays.asList("Saumya", "Mereline", "Caderson", "Baburao", "Bhishma", "Diana");
		list.stream().reduce((t, u) -> t.length() > u.length() ? t : u).ifPresent(System.out::println);
		System.out.println("----------------------------------");

		// Addition using reduce if 0 is not taken in reduce then it will give Optional
		List<Integer> array = Arrays.asList(-2, 0, 4, 6, 8);
		int intValue = array.stream().reduce(0, (a, b) -> a + b).intValue();
		System.out.println(intValue);
		System.out.println("----------------------------------");
		
		//Concatenating string
		String[] a= {"Om","Namah","Shivay"};
		Stream.of(a).reduce((t, u) -> t+"-"+u).ifPresent(System.out::println);
		System.out.println("----------------------------------");
		
		//reduce sum
		List<Integer> q = Arrays.asList(1,2,3,4,5);
		q.stream().reduce(Integer::sum).ifPresent(System.out::println);
		q.stream().reduce(Integer::max).ifPresent(System.out::println);
		q.stream().reduce(Integer::min).ifPresent(System.out::println);
		System.out.println("----------------------------------");
		
		//reversing string using reduce
		String s1 = Stream.of("Shivani".split("")).reduce("",(s,b)->b+s);
		System.err.println(s1);
		System.out.println("----------------------------------");
		
		//reversing each word using reduce
		String s2="Geeks For Geeks";
		Stream.of(s2.split("")).reduce((c9,m9)->m9+c9).ifPresent(System.out::println); //or
		Arrays.stream(s2.split("")).reduce((aka,bka)->bka+aka).ifPresent(System.out::println);
		}
}
