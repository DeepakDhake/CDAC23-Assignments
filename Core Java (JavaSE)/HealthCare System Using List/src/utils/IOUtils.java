package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.core.Patient;

public interface IOUtils {

	public static void storePatientDetails(String fileName, List<Patient> Plist) throws FileNotFoundException, IOException
	{
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			out.writeObject(Plist);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static List<Patient> restorePatientDetails(String fileName)
	{
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName)))
		{
			return (List<Patient>) in.readObject();
		}catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Patient>();
		}
	}
}
