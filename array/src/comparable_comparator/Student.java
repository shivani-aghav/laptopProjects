package comparable_comparator;
//we can sort by only single field 
//if we want to sort by another field implimentation must be changed
//cannot copy same method
//1st object will store as this then 2nd comes and 23-27 returns -1
//that is stored last then next comes  27-21 returns 1
//stores before then again 23-21 returs 1 gets stored 1st
public class Student implements Comparable<Student>{

	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.age-o.age;
	}
	
	

}
