package tester;

import static utils.IOUtils.restorePatientDetails;
import static utils.IOUtils.storePatientDetails;
import static utils.Validations.validateAllInputs;
import static utils.Validations.validateRoomType;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.core.Patient;

import enm.RoomType;

public class TestApp {

	public static void main(String[] args) {

		Map<Integer, Patient> Pmap = new TreeMap<>();

		try (Scanner sc = new Scanner(System.in)) {
			String fileName;
			System.out.println("Enter filename: ");
			fileName = sc.next();
			Pmap = restorePatientDetails(fileName);
			System.out.println("restored map " + Pmap);
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Add Patient 2.Display all Patients 3.Display Patient by RoomType"
						+ " 4.Delete Patient By Disease 5.Change RoomType of Patients 6.Sort Based ON Id " + "0.Exit");
				System.out.println("");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter SerialNo, Name, Address, Gender, Disease, Age, Mobno, Salary, AdmitDate, Room");
						Patient validPatient = validateAllInputs(sc.nextInt(), sc.next(), sc.next(), sc.next(),
								sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble(), sc.next(), sc.next(), Pmap);
						Pmap.put(validPatient.getSerialNo(), validPatient);
						System.out.println("Patient Added Successfully");
						break;
					case 2:
						Pmap.values().forEach(s -> System.out.println(s));
						break;
					case 3:
						System.out.println("Enter RoomType: ");
						RoomType room = validateRoomType(sc.next());
//						Pmap.values().forEach(s -> {
//							if(s.getRoom() == room)
//								System.out.println(s.toString());
//						});
						Pmap.values().stream().filter(p -> p.getRoom() == room).forEach(p -> System.out.println(p));
						break;

					case 4:
						System.out.println("Enter Name of Disease: ");
						String dis = sc.next();
						Pmap.values().removeIf(p -> p.getDisease().equals(dis));
						break;
					case 5:
						System.out.println("Enter RoomType: ");
						RoomType rm1 = validateRoomType(sc.next());
						System.out.println("Enter Roomtype to be changed into: ");
						RoomType rm2 = validateRoomType(sc.next());
						Pmap.values().stream().filter(p -> p.getRoom() == rm1).forEach(p -> p.setRoom(rm2));
						System.out.println("Room Type Changed");
						break;

					case 6:
						Pmap.values().stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
								.forEach(s -> System.out.println(s));
						break;
					case 0:
						storePatientDetails(fileName, Pmap);
						exit = true;
						System.out.println("~~~~~~~~Exiting~~~~~~~~");
						break;
					default:
						System.out.println("Invalid Option Selected");
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
