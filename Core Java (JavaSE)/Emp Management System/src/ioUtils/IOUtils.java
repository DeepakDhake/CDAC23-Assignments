package ioUtils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import employeeBase.Employee;

public interface IOUtils {
	static void storeEmpDetails(Map<String, Employee> empMap, String fileName) throws IOException {
		{
			try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
				out.writeObject(empMap);
			}
		}
	}

	@SuppressWarnings("unchecked")
	static Map<String, Employee> restoreEmpDetails(String fileName){
		{
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
				return (Map<String, Employee>) in.readObject();
			} catch (Exception e) {
				System.out.println("err during de-serial " + e);
				return new HashMap<>();
			}
		}
	}
}
