package ifElseAssignmentQuestion1;

public class OntarioLicense {

	int age;
	boolean knowledgeTestG1Cleared;
	boolean roadTestG2Cleared;
	boolean roadTestGCleared;

	void checkOnatrioLicenseIsIssued() {
		if (age >= 16) {

			System.out.println("You are eglible to get a License");

			if (knowledgeTestG1Cleared) {

				if (roadTestG2Cleared && roadTestGCleared) {

					System.out.println("G class License is issued");
				}

				else if (roadTestG2Cleared) {

					System.out.println("G2 class License is issued");
				}

				else {

					System.out.println("G1 class License is issued");
				}

			} else {
				System.out.println("License is not issued");
			}

		} else {
			System.out.println("You are not eglible to get a License");
		}
	}
}
