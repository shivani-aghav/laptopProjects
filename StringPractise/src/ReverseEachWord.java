import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two strings");
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
