package stream_practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpMain {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(new Employee(1, "Carol", 20000, Arrays.asList("Punjab", "Banglore"), "IT"),
				new Employee(2, "Santa", 18000, Arrays.asList("Pune", "Kolhapur"), "Backend"),
				new Employee(3, "Sunil", 11000, Arrays.asList("Nagpur", "Kolkata"), "IT"),
				new Employee(4, "Becca", 14000, Arrays.asList("Pavangiri", "Lysoon"), "Frontend"),
				new Employee(5, "Kiara", 10000, Arrays.asList("Odisha", "Jayanagar"), "Backend"));

		// max salary from employee
		list.stream().max(Comparator.comparing(Employee::getSal)).map(Employee::getSal).ifPresent(System.out::println);
		System.out.println("----------------------------------");

		// sorting 2 elements
		list.stream().sorted(Comparator.comparing(Employee::getDept).thenComparing(Employee::getName))
				.map(t -> t.getDept() + "-->" + t.getName()).forEach(System.out::println);
		System.out.println("----------------------------------");

		// sorting
		list.stream().sorted(Comparator.comparing(Employee::getSal)).map(t -> t.getName() + " " + t.getSal())
				.forEach(System.out::println);
		list.stream().sorted(Comparator.comparing(Employee::getSal).reversed()).map(t -> t.getName() + " " + t.getSal())
				.forEach(System.out::println);
		System.out.println("----------------------------------");

		// flatmap
		List<String> l2 = Arrays.asList("Sumedha", "Bhavya");
		List<String> l3 = Arrays.asList("Purva", "Laila");
		List<String> l4 = Arrays.asList("Majnu", "Jeetu");
		List<List<String>> asList = Arrays.asList(l2, l3, l4);
		System.out.println(asList);
		System.out.println();
		List<String> map = asList.stream().flatMap(t -> t.stream()).collect(Collectors.toList());
		System.out.println(map);
		System.out.println("----------------------------------");

		// filter
		list.stream().filter(t -> t.getSal() < 15000).map(t -> t.getName()).forEach(System.out::println);
		System.out.println("----------------------------------");

		// flatmap with filter
		List<Integer> q2 = Arrays.asList(2, 3);
		List<Integer> q3 = Arrays.asList(4, 5);
		List<Integer> q4 = Arrays.asList(6, 7);
		List<List<Integer>> q = Arrays.asList(q2, q3, q4);
		List<Integer> q5 = q.stream().flatMap(t -> t.stream()).filter(a -> a % 2 == 0).collect(Collectors.toList());
		System.out.println(q5);
		System.out.println("----------------------------------");

		// flatmap of employee
		list.stream().flatMap(t -> t.getCitiesWorked().stream()).filter(s -> s.startsWith("P"))
				.forEach(System.out::println);
		System.out.println("----------------------------------");

		// grouping
		list.stream().collect(Collectors.groupingBy(s -> s.getDept())).entrySet().forEach(System.out::println);
		System.out.println("----------------------------------");

		// reduce() here returns sal min or max amongst sal >14000
		list.stream().filter(t -> t.getSal() > 14000).map(Employee::getSal).reduce((t, u) -> t < u ? t : u)
				.ifPresent(System.out::println);//or
		list.stream().filter(t -> t.getSal() > 14000).map(Employee::getSal).reduce(Long::max)
		.ifPresent(System.out::println);
		System.out.println("----------------------------------");
	}
}
