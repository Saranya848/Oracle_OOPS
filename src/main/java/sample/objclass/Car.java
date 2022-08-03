package sample.objclass;

public class Car {
	static int wheels = 4;//static variable
	String color = "";//instance variable for state different 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Car xuv = new Car();
      Car rover = new Car();
      System.out.println("No of Wheels of xuv are " + xuv.wheels);
      System.out.println("No of Wheels of rover are " + rover.wheels);
      xuv.color = "White";
      System.out.println("color of xuv is " + xuv.color);
      rover.color = "Black";
      System.out.println("color of rover is " + rover.color);
	}

}
