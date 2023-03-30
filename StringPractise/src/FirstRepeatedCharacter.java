import java.util.HashMap;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
		String s="madam"; int i=0;
		char[] c = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char d : c) {
			if (map.containsKey(d)) {
				System.out.println(d);
				break;
			}
			map.put(d, i);
		}
	}
}
