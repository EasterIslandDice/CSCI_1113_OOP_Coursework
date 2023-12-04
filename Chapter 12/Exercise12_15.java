import java.util.*;
import java.io.*;

class Exercise12_15{
	public static void main(String[] args)  throws java.io.IOException{
		Random rand = new Random();
		ArrayList<Integer>array = new ArrayList<Integer>();
		PrintWriter output = new PrintWriter("Exercise12_15.txt");
		
		for (int i = 0; i < 100; i++){
			output.println(rand.nextInt(100));
		}
		output.close();
		
		try{
		Scanner fileInput = new Scanner(new File("Exercise12_15.txt"));
			
		while(fileInput.hasNext()){
			array.add(fileInput.nextInt());
		}
		fileInput.close();
		
		Collections.sort(array);
		}
		catch(InputMismatchException e){
			System.out.println("Invalid");
		}
		
		System.out.println(array);
	}
}