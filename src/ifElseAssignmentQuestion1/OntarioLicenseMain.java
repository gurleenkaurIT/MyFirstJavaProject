package ifElseAssignmentQuestion1;

public class OntarioLicenseMain {

	public static void main(String[] args) {
		OntarioLicense ontarioLicense = new OntarioLicense();
		ontarioLicense.age = 19;
		ontarioLicense.knowledgeTestG1Cleared = true;
		ontarioLicense.roadTestG2Cleared = true;
		ontarioLicense.roadTestGCleared = false;
		ontarioLicense.checkOnatrioLicenseIsIssued();
	}
}
