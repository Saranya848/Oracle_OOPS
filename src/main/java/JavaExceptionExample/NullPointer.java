package JavaExceptionExample;

public class NullPointer {

	public static void main(String args[]){  
		// Initializing String variable with null value
        String ptr = null;
 
        // Checking if ptr is null using try catch.
        try
        {
            if ("gfg".equals(ptr))
                System.out.print("Same" + ptr.length());
            else
                System.out.print("Not Same" + ptr.length());           
        }
        catch(NullPointerException e)
        {
            System.out.print("Caught NullPointerException");
        }
		  }  
}
