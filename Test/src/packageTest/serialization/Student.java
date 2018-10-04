package packageTest.serialization;

import java.io.Serializable;

public class Student implements Serializable{
	
	private int Roll;
	private int Age;
	private String Name;
	private transient String Address;
	private transient int Height;
	
	public Student(int Roll_Number, int age, String name, String address, int height) {
		this.Roll = Roll_Number;
		this.Age = age;
		this.Name = name;
		this.Address = address;
		this.Height = height;
		
	}

	public int getRoll() {
		return Roll;
	}

	public void setRoll(int roll) {
		Roll = roll;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}
	

}
