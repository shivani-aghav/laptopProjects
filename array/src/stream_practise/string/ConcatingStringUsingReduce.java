package stream_practise.string;

import java.util.stream.Stream;

public class ConcatingStringUsingReduce {

	public static void main(String[] args) {
		
		String[] a = { "Om", "Namah", "Shivay" };
		Stream.of(a).reduce((t, u) -> t + "-" + u).ifPresent(System.out::println);
		System.out.println("----------------------------------");
	}
}
