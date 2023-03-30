package stream_practise.string;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HackerRankLexicographically {

	public static void main(String[] args) {
		String s = "welcometojava";
		int k = 3;

		List<Object> m = new ArrayList<>();
        
		for (int i = 0; i < s.length(); i++) {
			if (i<=s.length()-3) {
				m.add(s.substring(i,i+3));				
			}
		}
		m.sort(Comparator.comparing(String::valueOf));
		List<Object> list = m.stream().sorted().collect(Collectors.toList());
		System.out.println(m.get(0));
		System.out.println(m.get(list.size()-1));
	}
}
