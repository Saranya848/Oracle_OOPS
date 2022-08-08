package JavaExceptionExample;

public class NumberFormat {

	private static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abc";  
		i = Integer.parseInt(s);
        try
        {
            if ("gfg".equals(s))
                System.out.print("Same" + s.length());
            else
                System.out.print("Not Same" + s.length());           
        }
        catch(NullPointerException e)
        {
            System.out.print("Caught NullPointerException");
        }
	}

}
