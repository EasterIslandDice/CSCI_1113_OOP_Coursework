public class Triangle extends GeometricObject {
	double side1;
	double side2;
	double side3;
	
	Triangle(){
		
	}
	
	Triangle(double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	Triangle(double side1, double side2, double side3, String color, boolean filled){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	double getSide1(){
		return side1;
	}
	
	void setSide1( double side1){
		this.side1 = side1;
	}
	double getSide2(){
		return side2;
	}
	
	void setSide2( double side2){
		this.side2 = side2;
	}
	double getSide3(){
		return side3;
	}
	
	void setSide3( double side3){
		this.side3 = side3;
	}
	
	
	public double getArea(double side1, double side2, double side3){
		double s = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(s * (s -side1) * (s - side2) * (s - side3));
		return area;
	}
	
	
	public double getPerimeter(double side1, double side2, double side3){
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	
	
}