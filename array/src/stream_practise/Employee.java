package stream_practise;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private long sal;
	private List<String> citiesWorked;
	private String dept;

	public Employee(int id, String name, long sal, List<String> citiesWorked, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.citiesWorked = citiesWorked;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + ", citiesWorked=" + citiesWorked + ", dept="
				+ dept + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSal() {
		return sal;
	}

	public void setSal(long sal) {
		this.sal = sal;
	}

	public List<String> getCitiesWorked() {
		return citiesWorked;
	}

	public void setCitiesWorked(List<String> citiesWorked) {
		this.citiesWorked = citiesWorked;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
