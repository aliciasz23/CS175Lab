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
		
		String hello = "Hello World";
		System.out.println(hello.length());
		hello=hello.replace("World","Joe");
		System.out.println(hello);
	}}