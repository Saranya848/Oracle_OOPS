package Example;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Strings
		//This variable used again and again
       String strg = "Hello";
       System.out.println("First data: " + strg);
     //This variable used with new variable
       String strg1 = new String("From Bridgelabz");
       System.out.println("First data: " + strg1);
       
       //Arrays
       int a[];
       a = new int[4];
       a[0] = 23;
       a[1] = 34;
       a[2] = 12;
       a[3] = 45;
       System.out.println("Array data " + a);//full array is presenting
       System.out.println("Array fulldata: " + a[2]);
	}

}
