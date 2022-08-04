package Pillars.abstraction;
//class to interface
interface Printable{
	int a=30;
	void Print();//abstract method
}
interface Showable{
	void Display();//abstract method
}
public class Testing implements Printable,Showable{
public void Print(){
	System.out.println("Print");
}
public void Display(){
	System.out.println("display");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//access the above functions
		Testing t = new Testing();
		t.Print();
		t.Display();
		System.out.println(t.a);//displaying variable value
		
	}

}
