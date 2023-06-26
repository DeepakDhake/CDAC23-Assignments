package utils;

import java.time.LocalDate;
import java.util.Map;

import com.core.Patient;

import customExceptions.PatientHandlingException;
import enm.RoomType;

public class Validations {

	public static Patient validateAllInputs(int serialNo, String name, String address, String gender, String disease,
			int age, int mobno, double salary, String admitDate, String room, Map<Integer, Patient> Pmap)
			throws PatientHandlingException {

		checkForDuplicateId(serialNo, Pmap);
		LocalDate d = parseAndValidateDate(admitDate);
		RoomType r = validateRoomType(room);
		return new Patient(serialNo, name, address, gender, disease, age, mobno, salary, d, r);
	}

	public static void checkForDuplicateId(int Id, Map<Integer, Patient> Pmap) throws PatientHandlingException {
		if (Pmap.containsKey(Id)) {
			throw new PatientHandlingException("Duplicate Id found");
		}
	}

	public static LocalDate parseAndValidateDate(String date)
			throws PatientHandlingException {
		LocalDate dt = LocalDate.parse(date);
		if (dt.equals(LocalDate.now())) {
			return dt;
		} else
			throw new PatientHandlingException("AdmitDate not equal to todays Date");

	}

	public static RoomType validateRoomType(String room) throws PatientHandlingException {
		//if () {
			return RoomType.valueOf(room.toUpperCase());
		//}
		//throw new PatientHandlingException("Room Not found");
	}

}
