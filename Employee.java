package company.ITsupport;

public class Employee extends CredentialService {
	
	String firstName;
	String lastName;
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getName() {
		return firstName;
	}
	public String getlastname() {
		return lastName;
	}
}
