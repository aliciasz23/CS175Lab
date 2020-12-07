
public class multiplicationTable {

	public static void main(String[] args) {

		for (int row = 1; row <= 10; row++) {
			for (int col = 1; col <= 10; col++) { //1...9
				int product = row * col; 
				if (product < 10)
					System.out.print("  " + product +" ");
				else if (product < 100)
					System.out.print(" " + product +" ");
				else
					System.out.print(product + " ");
			}
			System.out.println("");
		}

	}

}
