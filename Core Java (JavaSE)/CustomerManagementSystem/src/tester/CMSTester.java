package tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.core.Customer;

import custom_Exception.CustomerHandlingException;

import static validationRules.CustomerValidations.*;

public class CMSTester {

	public static void main(String[] args) {

		Map<String, Customer> cmap = new HashMap<>();
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Sign up\r\n" + "2.Sign in\r\n" + "3.Change password\r\n"
						+ "4.Un-subscribe customer\r\n" + "5.Display all customers\r\n" + "0.Exit");
				System.out.println("Select Option from above: ");
				try {
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Enter FirstName, LastName, Email, Password, Plan, RegAmount, DOB");
						Customer c = validateAllInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), cmap);
						cmap.put(c.getEmail(), c);
						System.out.println("Signedup Successfully");
						break;
					case 2:
						System.out.println("Enter email Id and Password: ");
						SignIn(sc.next(), sc.next(), cmap);
						break;
					case 3:
						System.out.println("Enter email Id and Password: ");
						String email = sc.next();
						SignIn(email, sc.next(), cmap);
						System.out.println("Enter new Password");
						String newPass = sc.next();
						cmap.values().stream().filter(p -> p.getEmail().equals(email)).forEach(p -> p.setPass(newPass));
						System.out.println("Password Updated Successfully");
						break;
					case 4:
						System.out.println("Enter your email Id: ");
						String mail = sc.next();
						if (cmap.containsKey(mail)) {
							cmap.remove(mail);
							System.out.println("Un-subscribed Successfully");
						} else
							throw new CustomerHandlingException("Invalid email Id");
						break;
					case 5:
						cmap.values().forEach(s -> System.out.println(s));
						break;
					case 0:
						System.out.println(">>>>>>>>>>Exiting>>>>>>>>>");
						exit = true;
						break;
					default:
						System.out.println("Invalid Input");
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}

}
