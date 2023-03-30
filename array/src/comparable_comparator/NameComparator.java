package comparable_comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

	//we cannot sort string directly
	//have to use compareTo()
	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}

}
