package methodsReturnAndParamters;

public class LoginRecords {

	String username;
	String password;
	String name;

//	public LoginRecords(String usrName, String pswrd, String userName) {
//		username = usrName;
//		password = pswrd;
//		name = userName;
//
//	}

	public LoginRecords(String username, String password, String name) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
	}

	public LoginRecords() {
		super();
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public boolean isUsernameCorrect(String enteredUsername) {
		if (username.equals(enteredUsername)) {
			return true;
		}
		return false;
	}

	public boolean isPasswordCorrect(String enteredPassword) {
		if (password.equals(enteredPassword)) {
			return true;
		}
		return false;
	}

	public LoginRecords loginWithValidCredentials(String enteredUsername, String enteredPassword,
			LoginRecords[] record) {
		for (int i = 0; i < record.length; i++) {
			if (record[i].getUsername().equals(enteredUsername) && record[i].getPassword().equals(enteredPassword)) {
				System.out.println("Record Found");
				return record[i];
			}
		}
		return null;
	}

	public void displayName() {
		System.out.println("Name of the User is : " + getName());
	}
}
