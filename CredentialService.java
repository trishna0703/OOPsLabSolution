package company.ITsupport;

public class CredentialService {
	

	public static String company = "wipro";
	
	public String generateEmailAddress( String firstName, String lastName, String department) {
		String email = "Email ---> " + firstName + lastName + '@' + department+"." + company + ".com";
		return email;
	}
	
	public String generatePassword() {
		String password = null;
		
		try {
			int num = (int)(Math.random()*9000) + 1000;
			String Uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String lowercase = "abcdefghijklmnopqrstuvwxyz";
			String specialChar = "!@#$%^&*";
			int index = (int)(Uppercase.length()* Math.random());
			int sc = (int)(specialChar.length()*Math.random());

			password = "Password ---> " + Uppercase.charAt(index)+""+ num +""+lowercase.charAt(index)+""+ specialChar.charAt(sc) +lowercase.charAt(sc+2) +""+ lowercase.charAt(sc) +""+ lowercase.charAt(sc+1);
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Sorry! Index is out of bound.");
		} catch (NullPointerException e) {
			System.out.println("Sorry! The password could not be generated.");
		}
		
		return password;
	}
	
	public void showCredentials(String email, String password, String firstName) {
		System.out.println("Dear " + firstName + ", your generated credentials are as follows: \n" + email +"\n" + password);
	}


}
