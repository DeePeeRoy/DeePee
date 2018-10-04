package packageTest.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {
	
	public static void main(String[] args) {
		Student s = null;
		
		try {
			FileInputStream fis = new FileInputStream("Student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			s = (Student)ois.readObject();
			ois.close();
			fis.close();
		}catch(IOException ex) {
			ex.printStackTrace();
			System.out.println("System  :::>>>>>>>>>>>>  "+ex);
			return;
		}catch(ClassNotFoundException cnfe) {
			cnfe.getStackTrace();
			cnfe.printStackTrace();
			System.out.println("ClassNotFoundException :::::>>>    "+cnfe);
			return;
		}
		
		System.out.println("Roll Number :::   "+s.getRoll());
		System.out.println("Age :::     "+s.getAge());
		System.out.println("Name :::::    "+s.getName());
		System.out.println("Address  ::::   "+s.getAddress());
		System.out.println("Height  :::::    "+s.getHeight());
	}

}
