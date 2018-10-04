package packageTest.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	
	public static void main(String[] args) {
		Student obj = new Student(101, 26, "Dee", "Delhi", 6);
		
		try {
			FileOutputStream fos = new FileOutputStream("Student.ser");
			System.out.println("FOS:: "+fos);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			System.out.println("oos >>>>> :::  "+oos);			
			oos.writeObject(obj);
			oos.close();
			fos.close();
			System.out.println("Serialization Done!!");
		}catch(Exception ex) {
			ex.getStackTrace();
			System.out.println("Exception  ::::::::   "+ex);
		}
		System.out.println("Roll :::>>>>::   "+obj.getRoll());
		System.out.println("Age  ::  >>>>>>>>::   "+obj.getAge());
		System.out.println("Name  ::::::::  >>>>>    "+obj.getName());
		System.out.println("Address  :::::::::  >>>>   "+obj.getAddress());
		System.out.println("Height   :::::::::::  >>>>  "+obj.getHeight());
	}
}