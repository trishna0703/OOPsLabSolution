package company.ITsupport;

public class Employee extends CredentialService {
	
	private String firstName;
	private String lastName;
	private String email;
	private char[] password;
	 String department;
	
	
	
	public Employee(String firstName, String lastName, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
		
	}
	@Override
	public String toString() {
		return String.format("Employee [ firstName=%s, lastName=%s, email=%s, password=%s, department=%s]", firstName, lastName,
				email, password, department);
	}
}
