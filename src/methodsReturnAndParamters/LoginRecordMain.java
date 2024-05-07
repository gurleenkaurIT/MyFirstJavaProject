package methodsReturnAndParamters;



public class LoginRecordMain {

	public static void main(String[] args) {
		LoginRecords user1 = new LoginRecords("gurleen01", "kaur02", "Gurleen");
		System.out.println("Username is: "+ user1.getUsername());
		System.out.println("Password is: "+ user1.getPassword());
		System.out.println("Name is: "+user1.getName());

//		user1.name = "Gurleen";
//		user1.username = "gurleen01";
//		user1.password = "kaur02";

		LoginRecords user2 = new LoginRecords("simran01", "kaur03", "Simran");
		System.out.println("Username is: "+ user2.getUsername());
		System.out.println("Password is: "+ user2.getPassword());
		System.out.println("Name is: "+user2.getName());

//		user2.name = "Simran";
//		user2.username = "simran01";
//		user2.password = "kaur03";

		LoginRecords user3 = new LoginRecords("Navneet01", "singh001", "Navneet");
		System.out.println("Username is: "+ user3.getUsername());
		System.out.println("Password is: "+ user3.getPassword());
		System.out.println("Name is: "+user3.getName());


//		user3.name = "Navneet";
//		user3.username = "Navneet01";
//		user3.password = "singh001";

//		LoginRecords[] record = { user1, user2, user3 };
//		System.out.println("First User is: " + record[0].getUsername());
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Username: ");
//		String enteredUsername = sc.next();
//
//		System.out.println("Enter Password: ");
//		String enteredPassword = sc.next();
//
//		LoginRecords login = new LoginRecords();
//		login.loginWithValidCredentials(enteredUsername, enteredPassword, record);
//		// login.isUsernameCorrect(enteredUsername);
//		user1.displayName();

	}

}
