import java.util.*;
import java.lang.Math;



class RWATriangle{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 sides of a triangle separated by spaces.");
		double one = input.nextDouble();
		double two = input.nextDouble();
		double three = input.nextDouble();
		String c = input.nextLine();
		System.out.println("What color is the triangle?");
		c = input.nextLine();
		Triangle triangle1 = new Triangle(one, two, three, c, false);
		System.out.println("Is the triangle filled? 1 - Yes 2 - No");
		int f = input.nextInt();
		if(f == 1){
			triangle1.setFilled(true);
		}
		System.out.println(triangle1.toString());
		
		
	}
}

class GeometricObject {
	String color = "Red";
	boolean filled = true;
	
	GeometricObject(){
		
	}
	
	GeometricObject(String thisColor, boolean isFilled){
		color = thisColor;
		filled = isFilled;
	}
	
	String getColor(){
		return color;
	}
	
	void setColor(String thisColor){
		this.color = thisColor;
	}
	boolean getFilled(){
		return filled;
	}
	
	void setFilled(boolean isFilled){
		this.filled = isFilled;
	}
	Date dateCreated(){
		Date date = new Date();
		return date;
	}
}

class Triangle extends GeometricObject {
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	Triangle (){
		
	}
	
	Triangle( double side1, double side2, double side3, String color, boolean filled){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.color = color;
		this.filled = filled;
	}
	
	double getSide1() {
		return side1;
	}
	
	double getSide2() {
		return side2;
	}
	
	double getSide3() {
		return side3;
	}
	
	double getArea(){
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s- side3));
		return area;
	}
	double getPerimeter(){
		double p = side1 + side2 + side3;
		return p;
	}
	
	public String toString(){
		return "Triangle created on " + this.dateCreated() + "\ncolor: " + this.getColor() + "\nfilled:" + this.getFilled()
		+ "\nside 1: " + side1 + "\nside 2 " + side2 + "\nside 3: " + side3 + "\narea: " + this.getArea() +
		"\nperimeter: " + this.getPerimeter();
	}
}