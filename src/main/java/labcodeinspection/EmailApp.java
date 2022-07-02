package labcodeinspection;

import java.util.Scanner;

public final class EmailApp {
	
	private EmailApp() {
        throw new java.lang.UnsupportedOperationException("Utility class and cannot be instantiated");
    }

	/**
	*
	*
	* @author Johanna
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String firstName = sc.nextLine();

		System.out.print("Enter your last name: ");
		String lastName = sc.nextLine();

		System.out.print("\nDEPARTMENT CODE\n1. for sales\n2. for Development\n3. for accounting\nEnter code: ");

		int depChoice = sc.nextInt();
		sc.close();

		Email email = new Email(firstName, lastName);
		email.setDeparment(depChoice);
		email.generateEmail();
		email.showInfo();
	}
}
