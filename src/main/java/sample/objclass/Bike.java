package sample.objclass;

public class Bike {
	//method
	//when action is same for all object
	static void action() {
		System.out.println("Breakes are applied to stop bike");
	}
	
	//when action is different for all object
	void mileage(int m) {
		System.out.println("Milage is " + m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Bike royal = new Bike();
      Bike duke = new Bike();
      //calling method using objects
      royal.action();
      duke.action();
      royal.mileage(35);
      duke.mileage(46);
	}
}
