package driver;

import java.util.Scanner;

import model.Department;
import model.Employee;
import service.CredentialService;
import java.util.InputMismatchException;
public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee("Pratik", "Nanda");
		System.out.println("Enter your Department");
		System.out.println("1.Technical\n2.Legal\n3.HR\n4.Managerial");
		Scanner scanner = new Scanner(System.in);
		Department department = new Department();
		CredentialService credentialservice = new CredentialService();
		
		try {
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			department.setDeptName("Technical");
			String email1 = credentialservice.generateEmail(employee, department);
			String password1 = credentialservice.generatePassword();
			credentialservice.showCredentials(email1, password1);
			break;
		case 2:
			department.setDeptName("Legal");
			String email2 = credentialservice.generateEmail(employee, department);
			String password2 = credentialservice.generatePassword();
			credentialservice.showCredentials(email2, password2);
			break;
		case 3:
			department.setDeptName("HR");
			String email3 = credentialservice.generateEmail(employee, department);
			String password3 = credentialservice.generatePassword();
			credentialservice.showCredentials(email3, password3);
			break;
		case 4:
			department.setDeptName("Managerial");
			String email4 = credentialservice.generateEmail(employee, department);
			String password4 = credentialservice.generatePassword();
			credentialservice.showCredentials(email4, password4);
			break;
		default:
			System.out.println("OMG!!!\nPlease choose from the given options.");

		}
		}
		catch (InputMismatchException e) {
			System.out.println("You IDIOT!\nPlease enter number");
		}
		

		scanner.close();
	}

}
