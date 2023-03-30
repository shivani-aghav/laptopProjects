package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		
//		Collections.sort(al);
//		al.forEach(System.out::println);
		Collections.sort(al, new AgeComparator());
	    al.forEach(System.out::println);
	    
	    Collections.sort(al, new NameComparator());
	    al.forEach(System.out::println);
	}
}
