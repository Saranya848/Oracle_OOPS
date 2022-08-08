package JavaExceptionExample;

public class Aioobe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s[]=new int[5];  
		s[10]=50; //ArrayIndexOutOfBoundsException 
        try
        {
            if ("gfg".equals(s))
                System.out.print("Same" + s.length);
            else
                System.out.print("Not Same" + s.length);           
        }
        catch(NullPointerException e)
        {
            System.out.print("Caught NullPointerException");
        }
	}

}
