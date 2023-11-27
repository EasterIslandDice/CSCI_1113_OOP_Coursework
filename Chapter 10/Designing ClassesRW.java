import java.util.*;

class Untitled {
	public static void main(String[] args) {
		MyInteger int1 = new MyInteger(25);
		MyInteger int2 = new MyInteger(13);
		MyInteger int3 = new MyInteger(36);
		MyInteger int4 = new MyInteger(5);
		
		//test methods isEven, isOdd, isPrime
		
		System.out.println(int1.getMyInteger() + " is even? " + int1.isEven() + ".");
		System.out.println(int1.getMyInteger() + " is odd? " + int1.isOdd() + ".");
		System.out.println(int1.getMyInteger() + " is prime? " + int1.isPrime() + ".");
		
		System.out.println(int2.getMyInteger() + " is even? " + int2.isEven() + ".");
		System.out.println(int2.getMyInteger() + " is odd? " + int2.isOdd() + ".");
		System.out.println(int2.getMyInteger() + " is prime? " + int2.isPrime() + ".");
		
		System.out.println(int3.getMyInteger() + " is even? " + int3.isEven() + ".");
		System.out.println(int3.getMyInteger() + " is odd? " + int3.isOdd() + ".");
		System.out.println(int3.getMyInteger() + " is prime? " + int3.isPrime() + ".");
		
		//test static methods
		
		System.out.println("93 is even? " + MyInteger.isEven(93) + ".");
		System.out.println("17 is odd? " + MyInteger.isOdd(17) + ".");
		System.out.println("24 is prime? " + MyInteger.isPrime(24) +".");
		
		//test equals
		System.out.println("25 equals " + int1.getMyInteger() + "? " + int1.equals(25) + ".");
		System.out.println("25 equals " + int2.getMyInteger() + "? " + int2.equals(25) + ".");
		//test parse
		System.out.println(MyInteger.parseInt(new char[] {'1', '5', '6'}));
		System.out.println(MyInteger.parseInt("454"));
	}
}
	//define class MyInteger
class MyInteger{
	int value;
	
	MyInteger(int newValue){
		value = newValue;
	}
	int getMyInteger(){
		return this.value;
	}
	boolean isEven(){
		if (value % 2 == 0){
			return true;}
		else{
			return false;
		}
	}
	boolean isOdd(){
		if (value % 2 != 0) {
			return true;}
		else {
			return false;
		}
	}
	boolean isPrime(){
		for (int i = 2; i < value; i++)
			if( value % i == 0)
				return false;
			return true;
	}
	static boolean isEven(int val){
		if (val % 2 == 0){
			return true;}
		else{
			return false;
		}
	}
	static boolean isOdd(int val){
		if (val % 2 != 0) {
			return true;}
		else {
			return false;
		}
	}
	static boolean isPrime(int val){
		for (int i = 2; i < val; i++)
			if(val % i == 0)
				return false;
			return true;
	}
	boolean equals(int val){
			if (val == value){
				return true;}
			else {
				return false;
			}
		}
	boolean equals(MyInteger val){
		if (val.value == this.value){
			return true;}
		else {
			return false;}
		}
	static int parseInt(char[] myChar){
		int sum = 0;
		for(int i = 0; i < myChar.length; i++){
			sum += Character.getNumericValue(i);
		}
		return sum;
	}
	static int parseInt(String myString){
		return Integer.valueOf(myString);
	}

}