package testerEmp;

import static empValidation.EmpValidationRules.*;

import java.util.Map;
import java.util.Scanner;

import employeeBase.Employee;

import static ioUtils.IOUtils.*;

public class TestEMS {

	public static void main(String[] args) {
		// Map<String, Employee> empMap = new HashMap<>();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter file name");
			String fileName = sc.next();
			// init pahe of app : restore
			Map<String, Employee> empMap = restoreEmpDetails(fileName);
			System.out.println("restored map " + empMap);
			boolean exit = false;
			while (!exit) {
				System.out.println("1. Hire new emp\r\n" + "2. List all emp details\r\n"
						+ "3. Sort emps as per join date\r\n" + "4. Delete emp details\r\n" + "0. Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Id, first_name, Last_name, Salary, Department, Date");
						Employee e = validateAllInputs(sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),
								sc.next(), empMap);
						empMap.put(e.getId(), e);
						System.out.println("Emp added Succeessfully");
						break;
					case 2:
						// empMap.forEach((k, v) -> System.out.println(v));
						empMap.values().forEach(s -> System.out.println(s));
						break;
					case 3:
						empMap.values().stream().sorted((e1, e2) -> e1.getDate().compareTo(e2.getDate()))
								.forEach(s -> System.out.println(s));
						break;
					case 4:
						System.out.println("Enter Employee ID to Delete: ");
						String newId = sc.next();
						if (empMap.containsKey(newId)) {
							empMap.remove(newId);
						}
						break;
					case 0:
						storeEmpDetails(empMap, fileName);
						exit = true;
						break;
					default:
						System.out.println("Invalid Input");
					}

				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}
	}

}
