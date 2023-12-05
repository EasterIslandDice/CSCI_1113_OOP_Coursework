import java.lang.*;

class Excercise1311 {
	public static void main(String[] args) {
			
		Octagon oct1 = new Octagon(6);
		Octagon oct2;
		
		try{
			oct2 = (Octagon)((Octagon)oct1.clone());
			System.out.println(oct1.compareTo(oct2));
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		
	}
}