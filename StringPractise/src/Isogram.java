import java.util.Scanner;

//isogram means word in which no letter occurs more than once
public class Isogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String---->");
		String s = sc.next();
		int count=0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j < c.length; j++) {
				if (c[i]==c[j]) {
					count++;
				}
			}
		}
        if (count>0) {
			System.out.println("Not Isogram");
		}else {
			System.out.println("Isogram");
		}
	}
}
