package Pillars.abstraction;

abstract class Parts{
//	we can have default and pararized constructor
	Parts(){
		
	}//default
	Parts(String name){
		
	}
	//	we can have one or more abstract methods
	abstract void function();
	abstract void add();
}
class Brakes extends Parts{
	void function1() {
		
	}//mb
}
public class Car {

	public static void main(String[] args) {
//		Parts p = new Parts();//we cannot create an Object of this class
		

	}

}
