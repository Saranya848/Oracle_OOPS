package Lambda;

interface MyInterface
{
     void abstractFunc(int x,int y);
 
     default void defaultFun()
    {
         System.out.println("This is default method");
    }
}

public class Main {

	public static void main(String[] args) {
		//lambda expression
        MyInterface obj = (int x, int y)->System.out.println(x+y);
 
        System.out.print("The result = ");
        obj.abstractFunc(5,5);
        obj.defaultFun();
        
        System.out.println("*******-------------********");
        
        MyInterface obj1 = (int x, int y)->System.out.println(x-y);
        
        System.out.print("The result = ");
        obj1.abstractFunc(54,35);
        obj1.defaultFun();
	}

}
