package vehicleValidation;

import java.time.LocalDate;
import java.util.List;

import com.core.Color;
import com.core.Vehicle;

import showRoomExceptions.vehicleHandlingException;

public class vehicleValidationRules {
	
	public static Vehicle validateAllInputs (String chasisNo, String colour, double netPrice, String manufactureDate, String company, List<Vehicle>vehicleList) throws vehicleHandlingException
	{
		checkForDuplicate(chasisNo, vehicleList);
		Color clr = validateColour(colour);
		netPrice = netPrice + clr.getPrice();
		LocalDate dateOfManu = parseAndValidateDate(manufactureDate);
		return new Vehicle(chasisNo,clr,netPrice,dateOfManu,company);
		
	}
	
	public static void checkForDuplicate(String newchasisNo, List<Vehicle>vehicleList) throws vehicleHandlingException {	
		Vehicle veh = new Vehicle(newchasisNo);
		if(vehicleList.contains(veh))
			throw new vehicleHandlingException("Duplicate Chassis No found");
	}
	
	public static Color validateColour(String colour)
	{
		return Color.valueOf(colour.toUpperCase());
	}
	
	public static LocalDate parseAndValidateDate(String date)
	{
		LocalDate today = LocalDate.parse(date);
		return today;
	}
	
}
