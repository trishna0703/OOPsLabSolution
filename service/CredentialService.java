package company.ITsupport;

import java.util.Random;

public class CredentialService {

	public static String company = "wipro";

	public String generateEmailAddress(Employee emp) {
		String email = "Email ---> " + emp.getFirstName() + emp.getLastName() + '@' + emp.getDepartment() + "."
				+ company + ".com";
		emp.setEmail(email);
		return email;
	}

	public char[] generatePassword(Employee emp) {
		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*1234567890abcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		int length = 12;
		char[] password = new char[length];
		password[0] = uppercase.charAt(random.nextInt(uppercase.length()));
		for (int i = 1; i < length; i++) {
			password[i] = characters.charAt(random.nextInt(characters.length()));
		}
		emp.setPassword(password);
		return password;
	}

	public void showCredentials(Employee emp) {
		System.out.println("Employee details  for " + emp.getFirstName() + " are: \n" + emp.getEmail() + "\n" + "Password ---> " +String.valueOf(emp.getPassword()));
	}

}
