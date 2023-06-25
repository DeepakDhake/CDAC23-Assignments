package utils;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.core.Patient;

import customExceptions.PatientHandlingException;
import enm.RoomType;

public class Validations {

	public static Patient validateAllInputs(int serialNo, String name, String address, String gender, String disease,
			int age, int mobno, double salary, String admitDate, String room, List<Patient> Plist)
			throws PatientHandlingException {

		checkForDuplicateId(serialNo, Plist);
		LocalDate d = parseAndValidateDate(admitDate, Plist);
		RoomType r = validateRoomType(room, Plist);
		return new Patient(serialNo, name, address, gender, disease, age, mobno, salary, d, r);
	}

	public static void checkForDuplicateId(int Id, List<Patient> Plist) throws PatientHandlingException {
		Patient p1 = new Patient(Id);
		if (Plist.contains(p1)) {
			throw new PatientHandlingException("Duplicate Id found");
		}
	}

	public static LocalDate parseAndValidateDate(String date, List<Patient> Plist)
			throws PatientHandlingException {
		LocalDate dt = LocalDate.parse(date);
		if (dt.equals(LocalDate.now())) {
			return dt;
		} else
			throw new PatientHandlingException("AdmitDate not equal to todays Date");

	}

	public static RoomType validateRoomType(String room, List<Patient> Plist) throws PatientHandlingException {
		//if () {
			return RoomType.valueOf(room.toUpperCase());
		//}
		//throw new PatientHandlingException("Room Not found");
	}

}
