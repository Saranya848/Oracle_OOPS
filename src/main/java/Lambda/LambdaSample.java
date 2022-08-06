package Lambda;

interface Shape{
	void draw();
}

class Rectangle implements Shape{
	@Override
	public void draw() {
		System.out.println("Rectangle class : draw() method");
	}
}

class Square implements Shape{
	@Override
	public void draw() {
		System.out.println("Rectangle class : draw() method");
	}
}

class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("Rectangle class : draw() method");
	}
}

class Cone implements Shape{
	@Override
	public void draw() {
		System.out.println("Rectangle class : draw() method");
	}
}


public class LambdaSample {
	String s = "Hello Message";
	
	//Lambda Expression
	Shape rectangle = () -> {
		System.out.println("Rectangle");
	};
	
	Shape square = () -> {
		System.out.println("Square");
	};
	
	Shape circle = () -> {
		System.out.println("Circle");
	};
	
	Shape cone = () -> {
		System.out.println("Cone");
	};
	
	
	
}