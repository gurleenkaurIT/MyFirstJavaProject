package loginLoopsAssignment;

/*Write a program which takes username and password from user via console and compares it with a user name and password
 saved in your class. 
 Saved user id and password are as below:
 username: pivotAdmin
 password:Admin123
 If the username and password entered by user matches with the one saved in your class, then print 
 “You are logged in to the application“ other wise  print “Incorrect User id or password.Try again”.  
 Also a user gets 3 chances enter the correct user name and password.
 If the user enters incorrect user name or password more than 3 times then print “ Account locked” 
*/

import java.util.Scanner;

public class Login {

	boolean isUserLoggedIn = false;

	Scanner sc = new Scanner(System.in);

	void checkUsernameAndPasswordAreValid() {

		for (int i = 0; i < 3; i++) {

			System.out.println("Please Enter Username : ");
			String username = sc.next();

			System.out.println("Please Enter Password : ");
			String password = sc.next();

			if (username.equals("pivotAdmin") && password.equals("Admin123")) {

				System.out.println("You are logged in to the application");
				isUserLoggedIn = true;
				break;

			} else {
				System.out.println("Incorrect User id or password. Try again");
			}
		}

		if (!isUserLoggedIn) {
			System.out.println("Account locked");
		}
	}
}
