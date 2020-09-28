package mailMerge;
import java.util.*;

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
		//I'm stuck on getting this to prompt yes or no. If I hit ENTER then an infinite amount 
		//of mail merges start to print out.
Scanner kbd = new Scanner (System.in);
String decision;
decision = input.nextLine();
boolean yn = true;
while (yn)
{		
		System.out.println("yes or no");
		switch(decision)
		{	
case "yes":
			yn = true;
			break;
		case "no":
			yn = false;
			break;
			
			default:
			
		System.out.println("please enter again");
		boolean repeat = true;
		}
// if user decides information is correct then the following will be mail merge
		System.out.println("Dear " + firstName + " " + lastName + ",");
		System.out.println(StreetAddress);
		System.out.println(CityState + ", " +  zipCode);
		

	}}
	}
