package tester;

import static vehicleValidation.vehicleValidationRules.validateAllInputs;
import static vehicleValidation.vehicleValidationRules.validateColour;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.core.Color;
import com.core.Vehicle;

import showRoomExceptions.vehicleHandlingException;

public class TestShowRoomApp {

	public static void main(String[] args) {

		boolean exit = false;
		List<Vehicle> vehicleList = new ArrayList<>();

		try (Scanner sc = new Scanner(System.in)) {
			while (!exit) {
				System.out.println("1.Add a Vehicle \n2.Display all Vehicles \n3.Get Specific Vehicle Details"
						+ "\n4.Delete Vehicle by Colour \n5.Delete Vehicle by ChassisNo."
						+ "\n6.Sort the vehicle as per chassisNo. \n7.Sort the vehicles by price"
						+ "\n8.Sort the vehicle as per chassisNo and price \n0.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter chasisNo, colour, netPrice, manufactureDate, company");
						Vehicle veh = validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(),
								vehicleList);
						vehicleList.add(veh);
						System.out.println("Vehicle Added Successfully");
						break;
					case 2:
						for (Vehicle v : vehicleList) {
							System.out.println(v);
						}
						break;
					case 3:
						System.out.println("Enter the Vehicle Chassis No.: ");
//						String s1 = sc.next();
//						for(Vehicle v : vehicleList)
//						{
//							if(v.getChasisNo().equals(s1))
//							{
//								System.out.println(v.toString());
//							}
//						}
						Vehicle veh1 = new Vehicle(sc.next());
						if (vehicleList.contains(veh1)) {
							System.out.println(vehicleList.toString());
						} else
							throw new vehicleHandlingException("Vehicle Not found");
						break;
					case 4:
						System.out.println("Enter the Vehicle Colour to Delete: ");
						Color c = validateColour(sc.next().toUpperCase());
						Iterator<Vehicle> itr = vehicleList.iterator();
						while (itr.hasNext())
							if (itr.next().getColour() == c)
								itr.remove();
						break;
					case 5:
						System.out.println("Enter the Vehicle Chassis No. to Delete: ");
						Vehicle veh2 = new Vehicle(sc.next());
						if (vehicleList.contains(veh2)) {
							vehicleList.remove(veh2);
							System.out.println("Vehicle Removed Successfully");
						} else
							throw new vehicleHandlingException("Vehicle Not found");
						break;
					case 6:
						vehicleList.stream().sorted((v1,v2) -> v1.getChasisNo().compareTo(v2.getChasisNo())).forEach(s -> System.out.println(s));
						break;
					case 7:
						vehicleList.sort(Comparator.comparingDouble(Vehicle::getNetPrice));
						vehicleList.forEach(s -> System.out.println(s));
						break;
					case 8:
						vehicleList.sort(
				                Comparator.comparing(Vehicle::getChasisNo)
				                        .thenComparing(Vehicle::getNetPrice)
				        );
						vehicleList.forEach(s -> System.out.println(s));
						break;
					case 0:
						System.out.println("<<<<<<<<<<<<Exiting>>>>>>>>>>>>>");
						System.exit(0);
						break;
					default:
						System.out.println("Invalid Option");
					}

				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}

			}

		}
	}
}
