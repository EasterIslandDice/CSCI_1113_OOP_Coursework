import java.lang.*;


public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
		double side;
		
		Octagon(){
			
		}
	
	Octagon(int side){
		this.side = side;
	}
	
	double getSide(){
		return this.side; 
	}
	
	void setSide(double side){
	this.side = side;
	}
	
	@Override
	public double getArea(){
		double area = ((2 + (4/Math.sqrt(2))) * side * side);
		return area;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return (Octagon)super.clone();
	}
	
	@Override
	public int compareTo(Octagon o){
		if (getArea() > o.getArea()) {
			return 1;
		}
		else if (getArea() < o.getArea()) {
			return -1;
		}
		else {
			return 0;
		}
	}
		
	}
