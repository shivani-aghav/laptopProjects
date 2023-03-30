package stream_practise.string;

public class Swap2StringsUsing3rdVariable {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "World";
		String tmp=null;
		System.out.println("Before swapping---> "+"s1= " + s1 + " s2= " + s2);
		tmp=s1;
		s1=s2;
		s2=tmp;
		System.out.println("After swapping---> "+"s1= " + s1 + " s2= " + s2);
	}
}
