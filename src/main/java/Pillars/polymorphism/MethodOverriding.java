package Example;

public class MethodOverriding {

	void area() {
		System.out.println("Area is measured by inches...");
	}
}
class Measure extends MethodOverriding{
	void area() {
		System.out.println("Area is measured by inches...");
	} 
}
