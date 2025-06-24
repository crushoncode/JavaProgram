package com.crushoncode.collectorscollect;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
// CrushOnCode
class Employee {
	private int id;
	private String name;
	private LocalDate dob;
	private String gender;
	private double salary;
	private String department;

	public Employee(String name) {
		super();
		this.name = name;
	}

	// ✅ Constructor with all fields
	public Employee(int id, String name, LocalDate dob, String gender, double salary, String department) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.salary = salary;
		this.department = department;
	}

	// ✅ Getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public String getGender() {
		return gender;
	}

	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

	// ✅ Setters
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	// ✅ toString (for easy printing)
	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", dob=" + dob + ", gender='" + gender + '\''
				+ ", salary=" + salary + ", department='" + department + '\'' + '}';
	}
}

public class TestMain {
	public static final String RESET = "\u001B[0m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";

	public static void main(String[] args) {

		List<Employee> code = new ArrayList<>();

		code.add(new Employee(1, "Anand Kumar", LocalDate.of(1990, 5, 21), "Male", 75000, "IT"));
		code.add(new Employee(2, "Neha Sharma", LocalDate.of(1992, 3, 15), "Female", 68000, "HR"));
		code.add(new Employee(3, "Ravi Verma", LocalDate.of(1988, 7, 10), "Male", 82000, "Finance"));
		code.add(new Employee(4, "Priya Singh", LocalDate.of(1995, 8, 12), "Female", 59000, "IT"));
		code.add(new Employee(5, "Amit Roy", LocalDate.of(1985, 9, 23), "Male", 94000, "Marketing"));
		code.add(new Employee(6, "Meena Kaur", LocalDate.of(1991, 4, 17), "Female", 62000, "HR"));
		code.add(new Employee(7, "Suresh Das", LocalDate.of(1987, 2, 14), "Male", 76000, "IT"));
		code.add(new Employee(8, "Kavita Rao", LocalDate.of(1993, 6, 30), "Female", 71000, "Finance"));
		code.add(new Employee(9, "Rahul Jain", LocalDate.of(1994, 12, 1), "Male", 66000, "Operations"));
		code.add(new Employee(10, "Shweta Nair", LocalDate.of(1989, 1, 25), "Female", 84000, "Marketing"));
		code.add(new Employee(11, "Vikram Mehta", LocalDate.of(1990, 11, 19), "Male", 91000, "Sales"));
		code.add(new Employee(12, "Pooja Rani", LocalDate.of(1996, 2, 10), "Female", 58000, "Finance"));
		code.add(new Employee(13, "Manish Yadav", LocalDate.of(1986, 10, 5), "Male", 72000, "IT"));
		code.add(new Employee(14, "Tina Desai", LocalDate.of(1993, 3, 20), "Female", 53000, "HR"));
		code.add(new Employee(15, "Deepak Joshi", LocalDate.of(1984, 5, 1), "Male", 98000, "Legal"));
		code.add(new Employee(16, "Sneha Pillai", LocalDate.of(1995, 9, 18), "Female", 60000, "IT"));
		code.add(new Employee(17, "Gaurav Malhotra", LocalDate.of(1992, 8, 7), "Male", 70000, "Marketing"));
		code.add(new Employee(18, "Ritika Sen", LocalDate.of(1991, 12, 24), "Female", 67000, "Sales"));
		code.add(new Employee(19, "Karan Gupta", LocalDate.of(1989, 4, 11), "Male", 81000, "Finance"));
		code.add(new Employee(20, "Ishita Bose", LocalDate.of(1997, 6, 5), "Female", 51000, "Support"));
		code.add(new Employee(21, "Nitin Sharma", LocalDate.of(1988, 3, 3), "Male", 77000, "Support"));
		code.add(new Employee(22, "Divya Patel", LocalDate.of(1996, 11, 2), "Female", 69000, "HR"));
		code.add(new Employee(23, "Abhay Raj", LocalDate.of(1990, 7, 21), "Male", 85000, "Operations"));
		code.add(new Employee(24, "Renu Yadav", LocalDate.of(1994, 10, 30), "Female", 63000, "Legal"));
		code.add(new Employee(25, "Sanjay Rathi", LocalDate.of(1991, 5, 17), "Male", 92000, "IT"));
		code.add(new Employee(26, "Lata Jain", LocalDate.of(1987, 1, 9), "Female", 74000, "Finance"));
		code.add(new Employee(27, "Arjun Mishra", LocalDate.of(1986, 6, 15), "Male", 79000, "Marketing"));
		code.add(new Employee(28, "Bhavna Kapoor", LocalDate.of(1993, 2, 8), "Female", 71000, "Sales"));
		code.add(new Employee(29, "Ajay Singh", LocalDate.of(1992, 9, 19), "Male", 88000, "Finance"));
		code.add(new Employee(30, "Kriti Malhotra", LocalDate.of(1998, 3, 12), "Female", 54000, "HR"));
		code.add(new Employee(31, "Harshita Yadav", LocalDate.of(1991, 1, 14), "Female", 64000, "Finance"));
		code.add(new Employee(32, "Yogesh Tiwari", LocalDate.of(1990, 8, 22), "Male", 83000, "IT"));
		code.add(new Employee(33, "Payal Agarwal", LocalDate.of(1995, 12, 19), "Female", 62000, "HR"));
		code.add(new Employee(34, "Kunal Sethi", LocalDate.of(1989, 4, 26), "Male", 71000, "Sales"));
		code.add(new Employee(35, "Alok Rana", LocalDate.of(1992, 6, 13), "Male", 86000, "Finance"));
		code.add(new Employee(36, "Roshni Verma", LocalDate.of(1993, 9, 10), "Female", 57000, "Support"));
		code.add(new Employee(37, "Yash Saxena", LocalDate.of(1994, 2, 7), "Male", 69000, "Marketing"));
		code.add(new Employee(38, "Nidhi Chauhan", LocalDate.of(1996, 3, 28), "Female", 65000, "IT"));
		code.add(new Employee(39, "Abhishek Dubey", LocalDate.of(1991, 10, 18), "Male", 93000, "Legal"));
		code.add(new Employee(40, "Sakshi Rana", LocalDate.of(1997, 11, 25), "Female", 61000, "Support"));
		code.add(new Employee(41, "Mohit Rawat", LocalDate.of(1986, 7, 14), "Male", 87000, "Sales"));
		code.add(new Employee(42, "Shruti Vyas", LocalDate.of(1989, 12, 1), "Female", 60000, "Operations"));
		code.add(new Employee(43, "Arvind Shekhar", LocalDate.of(1992, 1, 2), "Male", 89000, "IT"));
		code.add(new Employee(44, "Tanvi Bhatia", LocalDate.of(1994, 4, 6), "Female", 53000, "Finance"));
		code.add(new Employee(45, "Aayush Malhotra", LocalDate.of(1988, 6, 18), "Male", 97000, "Marketing"));
		code.add(new Employee(46, "Simran Kaul", LocalDate.of(1995, 10, 9), "Female", 68000, "HR"));
		code.add(new Employee(47, "Rohit Bhardwaj", LocalDate.of(1987, 3, 12), "Male", 75000, "Legal"));
		code.add(new Employee(48, "Sneha Arora", LocalDate.of(1990, 5, 11), "Female", 59000, "Support"));
		code.add(new Employee(49, "Viraj Sinha", LocalDate.of(1985, 9, 20), "Male", 88000, "Sales"));
		code.add(new Employee(50, "Kavya Mishra", LocalDate.of(1993, 7, 30), "Female", 71000, "Marketing"));
		code.add(new Employee(51, "Rajeev Bansal", LocalDate.of(1986, 11, 16), "Male", 92000, "Operations"));
		code.add(new Employee(52, "Bhavika Sharma", LocalDate.of(1997, 8, 3), "Female", 63000, "HR"));
		code.add(new Employee(53, "Deepanshu Grover", LocalDate.of(1988, 12, 22), "Male", 80000, "IT"));
		code.add(new Employee(54, "Divya Shukla", LocalDate.of(1991, 6, 5), "Female", 67000, "Finance"));
		code.add(new Employee(55, "Lakshay Jain", LocalDate.of(1987, 2, 14), "Male", 76000, "Legal"));
		code.add(new Employee(56, "Anushka Singh", LocalDate.of(1996, 5, 19), "Female", 56000, "Support"));
		code.add(new Employee(57, "Jayant Pathak", LocalDate.of(1989, 4, 25), "Male", 85000, "Marketing"));
		code.add(new Employee(58, "Zoya Khan", LocalDate.of(1994, 11, 8), "Female", 70000, "Sales"));
		code.add(new Employee(59, "Manoj Batra", LocalDate.of(1985, 1, 6), "Male", 91000, "Operations"));
		code.add(new Employee(61, "Ritika Dey", LocalDate.of(1993, 3, 15), "Female", 65000, "IT"));
		code.add(new Employee(61, "Roshni Verma", LocalDate.of(2002, 9, 10), "Female", 97000, "Support"));

		// ✅ 1. Filter IT Department Employees
//	        Q: Write a method to display all employees who belong to the IT department.

		System.err.println("\n=====all employees who belong to the IT department=======");
		code.stream().filter((dept) -> dept.getDepartment().equalsIgnoreCase("IT")).forEach(System.out::println);

//		 ✅ 2. Find Highest Paid Employee 
//		Q: Write a method that returns the employee with the highest salary from the list.
		Optional<Employee> max = code.stream().max((p1, p2) -> (int) (p1.getSalary() - p2.getSalary()));
		System.err.println("\n=======the employee with the highest salary from the list=====");
		System.out.println(max);

//		 ✅ 3. Count Employees by Gender Q: Write a method to count how many male and female employees exist.

		System.err.println("\ncount how many male and female employees ");
		Map<String, Long> genderCount = code.stream()
				.collect(Collectors.groupingBy(e -> e.getGender().toLowerCase(), Collectors.counting()));

		for (String key : genderCount.keySet()) {
			System.err.println(key + "  :::   " + genderCount.get(key));

		}
//		✅ 4. Average Salary of All Employees Q: Calculate the average salary of all employees.

		System.err.println("===============average salary of all employees===========");
		OptionalDouble average = code.stream().mapToDouble(Employee::getSalary).average();
		System.out.println("Average Sal :  " + average.getAsDouble());

//			 * ✅ 5. Group Employees by Department Q: Group all employees by their department display them department-wise.

		System.err.println("========Group Employees by Department ========");
		Map<String, List<Employee>> groupbyDept = code.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println();
		Set<String> deptKey = groupbyDept.keySet();
		for (String dKey : deptKey) {
			System.err.println(dKey);
			for (Employee emp : groupbyDept.get(dKey)) {
				System.out.println(emp);
			}
		}

//		 * ✅ 6. List Employees with Salary > 60000 Q: Find and print all employees whose salary is more than ₹60,000.
		System.out.println("\n");
		System.err.println("======== all employees whose salary is more than ₹60,000.=======");
		System.out.println();
		code.stream().filter((emp) -> emp.getSalary() > 60000).forEach(System.out::println);

//		 * ✅ 7. Sort Employees by Salary (Descending) Q: Sort and display the list of employees in descending order of salary.

		System.out.println("\n");
		System.out.println("\n");
		System.err.println("======== Sort Employees by Salary (Descending).=======");
//		code.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);
		code.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);

//		 * ✅ 8. Find Employee by ID Q: Create a method that takes an employee ID as input and returns the employee’s details.

		System.out.println("\n");
		System.err.println("========Find Employee by ID=======");
		System.out.println();
		code.stream().filter(findById -> findById.getId() == 20).forEach(System.out::println);

//		 * ✅ 9. Department-Wise Average Salary Q: Calculate the average salary of employees in each department (like IT, HR, Marketing, etc.).

		System.out.println("\n");
		System.err.println("========Department-Wise Average Salary =======");
		System.out.println();
		Map<String, Double> avgSalEachDept = code.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		for (String dept : avgSalEachDept.keySet()) {
			System.out.println(dept);
			System.out.println("Average Salary :" + avgSalEachDept.get(dept));
		}

//		or
		System.err.println("\n===========Or ==============\n");
		avgSalEachDept.forEach((dept, Sal) -> System.out.println(dept + "   ::  " + Sal));

//		* ✅ 10. Find Youngest Employee (Assuming DOB/age is added) Q: (Assuming an age or dateOfBirth field exists) Find the youngest employee in the company.
		System.err.println("\n=====Find Youngest Employee (Assuming DOB/age is added) =====\n");
		code.stream().sorted((e1, e2) -> e1.getDob().compareTo(e2.getDob())).limit(1).forEach(System.out::println);

		Optional<Employee> min = code.stream().min(Comparator.comparing(Employee::getDob));
		min.ifPresent((emp) -> {
			System.out.println(emp);
		});

//		✅ 11. Display All Departments (No Duplicates) Q: Write a method to print all unique department names from the employee list.

		System.err.println("\n=====Display All Departments (No Duplicates) =====\n");
		code.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
//	or	 Set<String> uniqueDepartments = employeeList.stream()
//		            .map(Employee::getDepartment)
//		            .collect(Collectors.toSet());

		System.err.println("\n=====Total Department=====\n");
		long count = code.stream().map(Employee::getDepartment).count();
		System.out.println("Total Department in Company :" + count);

//		 * ✅ 12. Find Employees Whose Names Start with 'A' Q: Find and print all  employees whose names start with the letter 'A' (case-insensitive).

		System.err.println("\n=====Find Employees Whose Names Start with 'A'=====\n");

		code.stream().map(Employee::getName).filter((name) -> name.startsWith("A")).forEach(System.out::println);

//		 * ✅ 13. Count Employees Per Department Q: Write a method that counts and displays the number of employees in each department.
		System.err.println("\n=====Count Employees Per Department=====\n");
		Map<String, Long> eachDepartmentEmpCount = code.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		eachDepartmentEmpCount.forEach((dpt, empct) -> {
			System.out.println(dpt + "  :    " + empct);
		});

//			* ✅ 14. Find Top 3 Highest Paid Employees Q: Display the top 3 highest paid employees in the company.
		System.err.println("\n=====Find Top 3 Highest Paid Employees=====\n");

		code.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(3)
				.forEach(System.out::println);

//			* ✅ 15. Check if All Employees Earn Above 50K Q: Write a method to check if all  employees earn more than ₹50,000. Return true or false.

		System.err.println("\n=====Check if All Employees Earn Above 50K=====\n");
		boolean allAbove50K = code.stream().allMatch(emp -> emp.getSalary() > 50000);
		System.out.println("Earn Above 50K :" + allAbove50K);

//			* ✅ 16. Find Any Employee from HR Department Q: Use Java streams (or loops) to fetch any one employee who belongs to the HR department.

		System.err.println("\n=====Find Any Employee from HR Department=====\n");
		Optional<Employee> any = code.stream().filter(emp -> emp.getDepartment().equals("HR")).findAny();

		System.out.println(any);

//			List all HR employees

		System.err.println("\n=====List all HR employees=====\n");
		code.stream().filter(emp -> emp.getDepartment().equals("HR")).forEach(System.out::println);

//			Find the highest paid HR employee
		System.err.println("\n=====Find the highest paid HR employee=====\n");

		Optional<Employee> highestpaidHR = code.stream().filter(emp -> emp.getDepartment().equals("HR"))
				.max(Comparator.comparing(Employee::getSalary));
		highestpaidHR.ifPresent(System.out::println);

//			Count HR employees			
		System.err.println("\n=====Count HR employees=====\n");
		long countHREmp = code.stream().filter(emp -> emp.getDepartment().equals("HR")).count();
		System.out.println("Count HR employees:" + countHREmp);

//			* ✅ 17. Check if There’s Any Employee in 'Legal' Department Q: Write a method to check if there's any employee in the Legal department.

		System.err.println("\n=====Check if There’s Any Employee in 'Legal' Department=====\n");
		boolean LegalDeptOrNot = code.stream().anyMatch(emp -> emp.getDepartment().equals("Legal"));
		System.out.println("Any Employee in 'Legal' Department :" + LegalDeptOrNot);

//			* ✅ 18. Find Male Employees in Marketing Q: Filter and display all male employees who work in the Marketing department.

		System.err.println("\n=====Find Male Employees in Marketing=====\n");
		code.stream().filter(emp -> {
			return emp.getDepartment().equalsIgnoreCase("Marketing") && emp.getGender().equalsIgnoreCase("male");
		}).forEach(System.out::println);

//			* ✅ 19. Display Names in Uppercase Q: Print only names of all employees in uppercase letters.

		System.err.println("\n=====Display Names in Uppercase=====\n");
		code.stream().map(Employee::getName).map(String::toUpperCase).forEach(System.out::println);

//			* ✅ 20. Find Employees with ID Between 5 and 15 Q: Display all employees whose  ID is between 5 and 15, inclusive.

		System.err.println("\n=====Find Employees with ID Between 5 and 15=====\n");
		code.stream().filter(emp -> (emp.getId() >= 5 && emp.getId() <= 15)).forEach(System.out::println);

//			* ✅ 21. Total Salary Paid by the Company Q: Calculate the total sum of salaries paid to all employees.

		System.err.println("\n=====Total Salary Paid by the Company====\n");
		double totSalPaidByComp = code.stream().mapToDouble(Employee::getSalary).sum();

		System.out.println("Total Salary :: " + totSalPaidByComp);

//			* ✅ 22. Display Gender-wise Salary Average Q: Compute average salary for males and females separately.

		System.err.println("\n=====Display Gender-wise Salary Average====\n");

		code.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
				.forEach((gen, sal) -> {
					System.out.println(gen + "  ::  " + sal);
				});

//			* ✅ 23. Get List of All Employee Names Q: Return a list containing only names of all employees.

		System.err.println("\n=====Get List of All Employee Names====\n");
		List<String> listOfEmpNames = code.stream().map(Employee::getName).toList();

		Iterator<String> empIterator = listOfEmpNames.iterator();
		while (empIterator.hasNext()) {
			System.out.println(empIterator.next());
		}

//			 * ✅ 24. Partition Employees by Gender Q: Split the employee list into two groups: Male and Female (e.g., using Map<Boolean, List<Employee>>).

		System.err.println("\n=====Partition Employees by Gender====\n");

		Map<String, List<Employee>> PartitionEmployeesbyGender = code.stream()
				.collect(Collectors.groupingBy(Employee::getGender));

		PartitionEmployeesbyGender.forEach((gen, Emp) -> {
			System.out.println("\n"+BLUE+gen+RESET+"\n");
			for (Employee emp : Emp) {
				System.out.println(emp);
			}
		});

		
//		* ✅ 25. Print Names of All Employees in IT Sorted by Salary Q: Filter employees from IT and sort them by salary before printing names.

		System.out.println("\n\u001B[32m=====Print Names of All Employees in IT Sorted by Salary====\u001B[0m");
		code.stream().filter(emp->emp.getDepartment().equalsIgnoreCase("IT"))
		.sorted(Comparator.comparing(Employee::getSalary))
		.map(Employee::getName)
		.forEach(System.out::println);
		
//		* ✅ 26. Longest Employee Name Q: Find the employee who has the longest name (character length).
		System.out.println("\n\u001B[36m=====Longest Employee Name====\u001B[0m");
		
		Optional<String> maxStringLength = code.stream().map(Employee::getName).max(Comparator.comparingInt(String::length));
		System.out.println(maxStringLength.get());
		
//		* ✅ 27. Check for Duplicate Names Q: Check if any duplicate names exist among employees.
		
		System.out.println("\n\u001B[36m=====Check for Duplicate Names====\u001B[0m");
		
		Map<String, Long> dupliNames = code.stream().collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));
		dupliNames.forEach((name,nc)->{
			if(nc>1)
			{
				System.out.println(name);
			}
		});
		
//		* ✅ 28. List Employees Sorted by Department Then Name Q: Sort employees first  by department name, then by employee name.
		
		System.out.println("\n\u001B[36m=====List Employees Sorted by Department Then Name====\u001B[0m");
		code.stream().sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getName))
		.forEach(System.out::println);
		
		
		
//		* ✅ 29. List All Employees Whose Name Contains 'i' Q: Display names of employees that contain the letter 'i' (case-insensitive).
		
		System.out.println("\n\u001B[36m=====List All Employees Whose Name Contains 'i' ====\u001B[0m");
		code.stream().filter(emp->emp.getName().toLowerCase().contains("i")).map(Employee::getName).forEach(System.out::println);
		
		
//		 * ✅ 30. Convert Employee List to Map (id → name) Q: Convert the employee list into a Map where key = id and value = name.
		System.out.println("\n\u001B[36m=====Convert Employee List to Map (id → name) ====\u001B[0m");
		Map<Integer, String> ListtoMap = code.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));
		ListtoMap.forEach((id,name)->{
			System.out.println(id+" :  "+name);
		});
		
		/* OR
		 * ⚠️ Note:
If there are duplicate IDs, you’ll get an exception. To handle duplicates, use:
.collect(Collectors.toMap(
    Employee::getId,
    Employee::getName,
    (existing, replacement) -> existing // or replacement
))
		 */
		
		
		
		
		
	}

}
