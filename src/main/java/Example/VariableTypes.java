package Example;

public class VariableTypes {
////	Local Varibles
//	void printName() {
//		//declaring local varible within method or block or constructor
//		//String name;//declariziation
//		String pnumber = "947586";//inilization
//		System.out.println("Phonenumber " + pnumber);
//	}//end of fun==deallocates memory
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		VariableTypes v = new VariableTypes();
//		v.printName();//method calling==memory allocate
//	}
	
//	instance Varibles
		int zipcode = 56384;//non static/instance variables
		static int pnumber = 947586;//static
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableTypes v = new VariableTypes();
		System.out.println("" + v.zipcode);
		System.out.println("" + pnumber);
	}

}
