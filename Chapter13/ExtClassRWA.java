import java.util.*;

class ExtClassRWA {
	public static void main(String[] args) {
		boolean filled = true;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 3 sides of a triangle:");
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		System.out.println("What color is the triangle?");
		String color = input.nextLine();
		System.out.println("Is the triangle filled? 1 - Yes 2- No");
		int choice = input.nextInt();
		
		if (choice == 1){
			filled = true;
		}
		else if (choice == 2){
			filled = false;
		}
		else {
			System.out.println("invalid");
			System.exit(0);
		}
		
		input.close();
		
		Triangle userTriangle = new Triangle(side1, side2, side3);
		
		userTriangle.setColor(color);
		userTriangle.setFilled(filled);
		
		System.out.println("Area: " + userTriangle.getArea(side1, side2, side3) + "\nPerimeter: " + userTriangle.getPerimeter(side1, side2, side3) + "\nColor: " + color + "\nFilled: " + filled);
	}
}
