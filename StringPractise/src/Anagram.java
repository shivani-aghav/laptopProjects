import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagram {

	public static void main(String[] args) {

		String a = "anagramm";
		String b = "marganaa";
		boolean c = true;
		List<List<String>> list = Stream.of(a.toLowerCase().split("")).sorted().map(t -> t)
				.collect(Collectors.groupingBy(t -> t)).entrySet().stream().map(x -> x.getValue())
				.collect(Collectors.toList());
		System.out.println(list);
		List<List<String>> list2 = Stream.of(b.toLowerCase().split("")).sorted().map(t -> t)
				.collect(Collectors.groupingBy(t -> t)).entrySet().stream().map(x -> x.getValue())
				.collect(Collectors.toList());
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).size() != list2.get(i).size()) {
				c = false;
				break;
			}
		}
		if (c)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");

//		String a = "anagramm";
//		String b = "marganaa";
//		char[] c1 = a.toCharArray();
//		char[] c2 = b.toCharArray();
//
//		Map<String, List<String>> map = Stream.of(a.toLowerCase().split("")).sorted().map(t -> t)
//				.collect(Collectors.groupingBy(t -> t));
//		Map<String, List<String>> map1 = Stream.of(b.toLowerCase().split("")).sorted().map(t -> t)
//				.collect(Collectors.groupingBy(t -> t));
//
//		for (int i = 0; i < c2.length; i++) {
//			if (map.entrySet().contains(map1)) {
//				System.out.println(map1);
//			}
//			
//			
//		}
	}
}
