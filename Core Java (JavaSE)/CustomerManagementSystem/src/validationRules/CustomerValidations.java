package validationRules;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import com.core.Customer;
import com.core.Serplan;

import custom_Exception.CustomerHandlingException;

public class CustomerValidations {

	public static Customer validateAllInputs(String fname, String lname, String email, String pass, String plan,
			double reg_amt, String dOB, Map<String, Customer> cmap) throws CustomerHandlingException {
		checkForDuplicate(email, cmap);
		Serplan sp = parseAndValidatePlan(plan, reg_amt, cmap);
		LocalDate dd = parseAndValidateAge(dOB, cmap);
		return new Customer(fname, lname, email, pass, sp, reg_amt, dd);
	}

	public static void checkForDuplicate(String eml, Map<String, Customer> cmap) throws CustomerHandlingException {
		if (cmap.containsKey(eml)) {
			throw new CustomerHandlingException("Duplicate email ID found");
		}
	}

	public static Serplan parseAndValidatePlan(String planName, double price, Map<String, Customer> cmap)
			throws CustomerHandlingException {
		if (cmap.containsKey(planName)) {
			if (Serplan.valueOf(planName).getPlan() != price) {
				throw new CustomerHandlingException("Registration amount incorrect");
			}
		}
		return Serplan.valueOf(planName.toUpperCase());
	}

	public static LocalDate parseAndValidateAge(String dOB, Map<String, Customer> cmap)
			throws CustomerHandlingException {
		LocalDate date = LocalDate.parse(dOB);
		int age = Period.between(date, LocalDate.now()).getYears();
		if (age > 18)
			return date;
		throw new CustomerHandlingException("Age below 18 Years");
	}

	public static void SignIn(String email, String pass, Map<String, Customer> cmap) {
		Customer cn;
		if (cmap.containsKey(email)) {
			cn = cmap.get(email);
			if (cn.getPass().equals(pass)) {
				System.out.println("Signed in Successfully");
			} else
				System.out.println("Invalid Password");
		} else
			System.out.println("Invalid Email ID");
	}

}
