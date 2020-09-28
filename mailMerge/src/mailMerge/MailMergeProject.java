package mailMerge;
import java.util.*;

import javax.swing.JOptionPane;

public class MailMergeProject {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		String firstName;
		firstName = input.nextLine();
		
		System.out.println("Please enter your last name: ");
		String lastName;
		lastName = input.nextLine();
		
		System.out.println("Please enter Street Address: ");
		String StreetAddress;
		StreetAddress = input.nextLine();
		
		System.out.println("Please enter City, State: ");
		String CityState;
		CityState = input.nextLine();
		
		System.out.println("Please enter zip code:  ");
		String zipCode;
		zipCode = input.nextLine();
		
		System.out.println("Please confirm your address: ");
		System.out.println(StreetAddress);
		System.out.println(CityState + ", " +  zipCode);
		
		int response = JOptionPane.showConfirmDialog(null, "Is the address correct ?", "Confirm",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		//Now display response result
		
		if(response==JOptionPane.YES_OPTION) {
			//if yes option select..
			System.out.println("YES");
		System.out.println("Dear " + firstName + " " + lastName + ",");
		System.out.println(StreetAddress);
		System.out.println(CityState + ", " +  zipCode);
		
		}}
}
