package tester;

import static utils.IOUtils.*;
import static utils.Validations.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.core.Patient;

import enm.RoomType;

public class TestApp {

	public static void main(String[] args) {

		List<Patient> Plist = new ArrayList<>();

		try (Scanner sc = new Scanner(System.in)) {
			String fileName;
			System.out.println("Enter filename: ");
			fileName = sc.next();
			Plist = restorePatientDetails(fileName);
			System.out.println("restored map " + Plist);
			boolean exit = false;
			while (!exit) {
				System.out.println("1.Add Patient 2.Display all Patients 3.Display Patient by RoomType"
						+ " 4.Delete Patient By Disease 5.Change RoomType of Patients 6.Sort Based ON Id "
						+ "0.Exit");
				System.out.println("");
				try {
					switch (sc.nextInt()) {
					case 1: //Add a patient
						System.out.println("Enter SerialNo, Name, Address, Gender, Disease, Age, Mobno, Salary, AdmitDate, Room");
						Patient validPatient = validateAllInputs(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble(), sc.next(), sc.next(), Plist);
						Plist.add(validPatient);
						System.out.println("Patient Added Successfully");
						break;
					case 2: //Display all Patients
						Plist.forEach(s -> System.out.println(s));
						break;
					case 3: //Display all Patients based on RoomType
						System.out.println("Enter RoomType: ");
						RoomType room = validateRoomType(sc.next(), Plist);
//						Pmap.values().forEach(s -> {
//							if(s.getRoom() == room)
//								System.out.println(s.toString());
//						});
						Plist.stream().filter(p -> p.getRoom() == room).forEach(p -> System.out.println(p));
						break;
	
					case 4: //Remove all patients based on a Disease
						System.out.println("Enter Name of Disease: ");
						String dis = sc.next();
						Plist.removeIf(p -> p.getDisease().equalsIgnoreCase(dis));
						break;
					case 5: //Change RoomType from One to other
						System.out.println("Enter RoomType: ");
						RoomType rm1 = validateRoomType(sc.next(), Plist);
						System.out.println("Enter Roomtype to be changed into: ");
						RoomType rm2 = validateRoomType(sc.next(), Plist);
						Plist.stream().filter(p -> p.getRoom() == rm1).forEach(p -> p.setRoom(rm2));
						System.out.println("Room Type Changed");
						break;
	
					case 6: //Sort Patients based on Name
						Plist.stream().sorted((p1,p2) -> p1.getName().compareTo(p2.getName())).forEach(s -> System.out.println(s));
						break;
					case 0: //Store Patients details in Persistent Manner
						storePatientDetails(fileName, Plist);
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
