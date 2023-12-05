import java.util.*;

class ImplementingInterfaces {
	public static void main(String[] args) {
		Triangle[] tArr = new Triangle[5];
		
		tArr[0] = new Triangle(5, 4, 4);
		tArr[1] = new Triangle(4, 7, 5);
		tArr[2] = new Triangle(3, 4, 2);
		tArr[3] = new Triangle(6, 5, 4);
		tArr[4] = new Triangle(3, 2, 3);
		
		tArr[2].setFilled(true);
		tArr[4].setFilled(true);
		
		System.out.println("Triangle 1: \nArea: " + tArr[0].getArea());
		tArr[0].howToColor();
		System.out.println("Triangle 2: \nArea: " + tArr[1].getArea());
		tArr[1].howToColor();
		System.out.println("Triangle 3: \nArea: " + tArr[2].getArea());
		tArr[2].howToColor();
		System.out.println("Triangle 4: \nArea: " + tArr[3].getArea());
		tArr[3].howToColor();
		System.out.println("Triangle 5: \nArea: " + tArr[4].getArea());
		tArr[4].howToColor();
		
	}
}