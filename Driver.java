package company.ITsupport;

public class Driver {

	public static void main(String[] args) {
		Employee emp = new Employee("Trishna", "Kashyap");
		SuperDepartment dep = new TechDepartment();

		String fn = emp.getName();
		String ln =  emp.getlastname();
		String department = dep.departmentName();
		
		String email = emp.generateEmailAddress(fn, ln, department);
		
		String psd = emp.generatePassword();
		
		emp.showCredentials(email, psd, fn);
	}

}
