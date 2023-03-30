import java.util.HashMap;

public class SortedValues {

	public static void main(String[] args) {
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('A', 3);
		map.put('B', 4);
		map.put('C', 2);
		map.put('D', 1);

		map.entrySet().stream().sorted((o1, o2) -> o1.getValue() - o2.getValue()).forEach(System.out::println);

	}
}
