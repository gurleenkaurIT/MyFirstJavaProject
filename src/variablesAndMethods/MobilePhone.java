package variablesAndMethods;

public class MobilePhone {

	/*
	 * Methods and variables are core components of the class DataType variableName
	 * = value; data type variable name is declaring a variable value is
	 * initializing a variable and ; is end of block
	 */

	// Data type String store character values and String default value is null
	String colour = "White"; // declared and initialized
	String material = "Metal";
	String model; // only declared

	// int, byte, long store integer values
	// default value of int is 0

	int memory = 8;

	// double, float stores decimal values
	// default value of double is 0.0
	double screenSize = 6.5;
	float cameraConfig = 1.3f;

	// stores condition true or false and by default boolean value is false
	boolean isFaceRecogAvaiable = true;

	// Method of the class, they perform some action
	// Method and variable are part of class, but code written inside is part of
	// method not class

	void makeCalls() {
		// Print a line
		// shortcut Ctrl + space bar for syso
		System.out.println("Making a call");
		System.out.println(memory); // Printing a variable declared and initialized in this class

	}

}
