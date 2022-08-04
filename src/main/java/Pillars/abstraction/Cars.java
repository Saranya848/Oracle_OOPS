package Pillars.abstraction;
abstract class Parts1{
	String name;
	Parts1(String name){
		this.name=name;
	}
	//	we can have one or more abstract methods
	abstract void function();
	void fun() {
		System.out.println(name);
	}
}
class Brakes1 extends Parts1{
	Brakes1(String name){
		super(name);
	}
	void function() {
		System.out.println("Car should be halted");
	}
}
class Accelerator1 extends Parts1{
	Accelerator1(String name){
		super(name);
	}
	void function() {
		System.out.println("Car should increase its speed");
	}
}
class Gear extends Parts1{
	int ge;
	Gear(String name, int ge){
		super(name);
		this.ge=ge;
	}
	void function() {
		System.out.println("Car gear should be changed " + ge);
	}
}
public class Cars {

	public static void main(String[] args) {
		Brakes1 b = new Brakes1("Brakes");
		b.function();
		b.fun();
		Accelerator1 a = new Accelerator1("Acceleraotr");
		a.function();
		a.fun();
		Gear g = new Gear("Gear", 5);
		g.function();
		g.fun();
	}

}
