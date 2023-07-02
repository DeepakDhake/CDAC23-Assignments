package empValidation;

import java.time.LocalDate;
import java.util.Map;

import custom_Excp.EmpHandlingException;
import employeeBase.Dept;
import employeeBase.Employee;

public class EmpValidationRules {
	
	
	public static Employee validateAllInputs(String id, String fname, String lname, double sal, String department, String date, Map<String, Employee> empMap) throws EmpHandlingException
	{
		checkforDuplicateEmp(id, empMap);
		Dept d1 = parseAndValidateDepartment(department);
		LocalDate d2 = parseAndValidateDate(date);
		return new Employee(id,fname,lname,sal,d1,d2);
	}

		public static String checkforDuplicateEmp(String newempId, Map<String, Employee> empMap) throws EmpHandlingException
//			throws EmpHandlingException {
//		Employee e = new Employee(newempId);
//		if (empMap.containsKey(newempId)) {
//			throw new EmpHandlingException("Duplicate Employee ID found!!!!!");
//		}
//	}
		{
			if(empMap.containsKey(newempId))
				throw new EmpHandlingException("Duplicate Employee ID Found");
			return newempId;
		}

	public static LocalDate parseAndValidateDate(String joinDate) throws EmpHandlingException {
		LocalDate date = LocalDate.parse(joinDate);
		LocalDate compDate = LocalDate.parse("2020-01-01");
		if (date.isAfter(compDate))
			return date;
		throw new EmpHandlingException("Invalid Joining Date");
	}

	public static Dept parseAndValidateDepartment(String dep) {
		return Dept.valueOf(dep.toUpperCase());
	}

}
