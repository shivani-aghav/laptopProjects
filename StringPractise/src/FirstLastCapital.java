

import java.util.Arrays;

public class FirstLastCapital {

	public static void main(String[] args) {
		String s = "shivani aghav";
		String[] a = s.split(" ");
        Arrays.stream(a).map(b->b
        		.substring(0, 1).toUpperCase()
        		+b.substring(1, b.length()-1)
        		+b.substring(b.length()-1)
        		.toUpperCase()+" ").forEach(System.out::print);
        
		
	
	}
}
