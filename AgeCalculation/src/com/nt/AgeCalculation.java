package com.nt;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class AgeCalculation {

	public static void main(String[] args)throws Exception
	{
		//read inputs
		Scanner sc = new Scanner(System.in);
      
      	// SimpleDateFormat class is what's used to translate Strings that are typed in 
      	// on the JOptionPane into dates. 
      	SimpleDateFormat sdf1 = new SimpleDateFormat("MM/DD/YYYY");
      
      	
		String userInputString = JOptionPane.showInputDialog("Enter your birthdate (MM/DD/YYYY):");
     	
      	// Convert user input string into an actual Date object.
      	Date userBirthDate = sdf1.parse(userInputString);	
      	
      
	
      	// This determines how many milliseconds the person has been alive.
		long ms = System.currentTimeMillis() - userBirthDate.getTime();
	
		
      	// And this math converts milliseconds into years.
		long age = (long)((long)ms/(1000.0*60*60*24*365));
		
		//Math converts millisecond into months
		long day = (1000*60*60*24*30);
		long time = day * 39;
		
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(time);
		int mMonth = c. get(Calendar.MONTH);
		
		System.out.println(age);
		JOptionPane.showMessageDialog(null, "You are " + age +" years and " + mMonth + " months old.");
		
    }
}