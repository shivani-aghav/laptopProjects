package stream_practise.string;

import java.util.stream.Stream;

public class RemoveFirstAndLast {

	public static void main(String[] args) {
		//using normal
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter any String->");
//		String s = sc.next();
//		String s1 = s.substring(1);
//		String s2 = s1.substring(0,s1.length()-1);
//		System.out.println(s2);
		
		String s="shivani";
		Stream.of(s.substring(1).substring(0,s.length()-2)).forEach(System.out::println);//or
		Stream.of(s.subSequence(1, s.length()-1)).forEach(System.out::println);
		
		
		System.out.println("----------------------------------");
		String s1 = s.substring(0, 1);
		String s2 = s.substring(s.length()-1, s.length());
		System.out.println(s1+"--"+s2);
		
	}
}
