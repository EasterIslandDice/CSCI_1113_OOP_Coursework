import java.util.*;
import java.text.*;

public class TestRectangle {
	public static void main(String[] args) {
	DecimalFormat df = new DecimalFormat("##0.00");
	Rectangle rectangle1 = new Rectangle(40, 4);
	System.out.println("The width of this rectangle is " + rectangle1.width + ". The height is " + rectangle1.height + ". The area is "
		+ rectangle1.getArea() + ". The perimeter is " + rectangle1.getPerimeter() + ".");
		
	Rectangle rectangle2 = new Rectangle(35.9, 3.5);
	System.out.println("The width of this rectangle is " + rectangle2.width + ". The height is " + rectangle2.height + ". The area is "
		+ df.format(rectangle2.getArea()) + ". The perimeter is " + rectangle2.getPerimeter() + ".");
	
	}
private static class Rectangle{
	double height;
	double width;

Rectangle(){
	height = 1;
	width = 1;
}
	
	Rectangle(double newHeight, double newWidth){
		height = newHeight;
		width = newWidth;
	}
	double getArea(){
		return height * width;
	}
	double getPerimeter(){
		return (2 * height) + (2 * width);
	}
}
}
	
	