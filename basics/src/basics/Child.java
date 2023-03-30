package basics;

public class Child extends Parent {

	public static void m1() {
		System.out.println("child class m1()");
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		Child.m1();
		Parent p=new Child();
		Parent.m1();
	}
}
