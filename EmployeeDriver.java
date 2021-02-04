package day4assignment;

import java.io.*;

public class EmployeeDriver {

	public static void main(String[] args) {
		Address address = new Address("Model Town", "110042");
		Employee employee = new Employee("Surbhi Singhal", "pl143", address, 90000.0);

		try {

			FileOutputStream file = new FileOutputStream("Employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(employee);

			out.close();

			System.out.println("Employee Details before Deserialization.");
			System.out.println(employee.toString());
		}

		catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("IOException caught");
		}

		Employee employee1 = null;

		try {

			FileInputStream file = new FileInputStream("Employee.ser");
			ObjectInputStream in = new ObjectInputStream(file);

			employee1 = (Employee) in.readObject();

			in.close();

			System.out.println("Employee Details after Deserialization.");
			System.out.println(employee1.toString());
		}

		catch (IOException ex) {
			System.out.println("IOException caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException caught");
		}
	}

}
