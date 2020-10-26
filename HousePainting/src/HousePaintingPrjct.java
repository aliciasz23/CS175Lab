import java.util.Scanner;

public class HousePaintingPrjct {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		//Accept building length
		System.out.println("Please enter length of the building:  ");
		int houseLength = in.nextInt();
				
		
		//Accept building width
		System.out.println("Please enter the width of the building:  ");
		int houseWidth = in.nextInt();
				
		
		//Accept building height
		System.out.println("Please enter the height of the building:  ");
		int houseHeight = in.nextInt();
				
		
		//Accept number of windows, window length & height.		
		System.out.println("Enter the total amount of windows on the House:  ");
		int numWindows = in.nextInt();
		
		System.out.println("Enter the length of the windows:  ");
		int windowLength = in.nextInt();
		
		System.out.println("Enter the width of the windows: ");
		int windowWidth = in.nextInt();
		
		
				
		//Accept number of doors, door length and height.
		System.out.println("Enter the amount of doors in the house: ");
		int numDoors = in.nextInt();
		
		System.out.println("Enter the length of the doors: ");
		int doorLength = in.nextInt();
		
		System.out.println("Enter the width of the doors:  ");
		int doorWidth = in.nextInt();
				
		//Painter cost per sq ft
		System.out.println("Enter the cost per square foot set by the painter:   " +"$");
		int sqftCost = in.nextInt();
		
		//Sq FT for a normal side = L*W
		int totalSqFtNoPeak = houseLength * houseWidth * 2;
		
	
		//SQ FT for a peak side
		int number = (houseLength*(houseHeight-houseWidth))/2;
		int totalSqFtPeak = (houseLength * houseWidth + number)*2; 
	 	
		
	 	
	 	
		//SQ FT Calculation for windows and doors
		int windowSqFt = windowLength * windowWidth;
		
		
		int doorSqFt = doorLength * doorWidth;
	
		//Total sq ft to paint
		int totalSqFtToPaint = totalSqFtPeak + totalSqFtNoPeak - windowSqFt * numWindows - doorSqFt * numDoors;
		
		
		//Total cost to paint
		int totalCostToPaint = sqftCost * totalSqFtToPaint;
		
		
		System.out.println("The surface area exterior is: " + totalSqFtToPaint + " square feet");
		System.out.println("Your estimate is:" +"$ "+totalCostToPaint);
		
				
				
				
				
				
				
				
				
				
				
				
	}

}
