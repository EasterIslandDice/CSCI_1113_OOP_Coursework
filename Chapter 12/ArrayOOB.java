import java.util.*;

class ArrayOOB {
	public static void main(String[] args) {
		Random myRandom = new Random();
		int[] myArray = new int[100];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 100; i++){
			myArray[i] = myRandom.nextInt(100);
		}
		System.out.println("Please enter an index number between 0 and 99.");
		int index = input.nextInt();
		
		try {
			System.out.print(myArray[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("Out of Bounds");
		}
		
	}
}