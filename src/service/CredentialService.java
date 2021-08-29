package service;

import model.Employee;

import java.util.Random;

import model.Department;

public class CredentialService {
	public String generateEmail(Employee employee, Department department) {
		String email = employee.getFirstName() + employee.getLastName()+
				"@"+department.getDeptName()+".company.com";
		return email;
	}

	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";

		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		Random random = new Random();
		char[] password = new char[8];	
		
		for (int i=0; i<8;i++) {
		password[i]=values.charAt(random.nextInt(values.length()));
		}
		return password.toString();
	}
	
	public void showCredentials(String email, String password) {
		
		System.out.println("Email is "+ email);
		System.out.println("Password is "+ password);
		
	}

}
