package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.TreeMap;

import com.core.Patient;

public interface IOUtils {

	public static void storePatientDetails(String filename, Map<Integer, Patient> Pmap)
			throws FileNotFoundException, IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) 
		{
			out.writeObject(Pmap);
		}
	}

	@SuppressWarnings("unchecked")
	public static Map<Integer, Patient> restorePatientDetails(String filename)
			throws FileNotFoundException, IOException {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
			return (Map<Integer, Patient>) in.readObject();
		} 
		catch (Exception e) {
			e.printStackTrace();
			return new TreeMap<>();
		}
	}

}
