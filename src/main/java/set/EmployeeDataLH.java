package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class EmployeeDataLH {

	public static void main(String[] args) {
		//Creating HashSet and adding elements  
	    LinkedHashSet<String> set=new LinkedHashSet();  
	           set.add("Name: Harsha");    
	           set.add("City: Vizag");    
	           set.add("Pincode: 539504");   
	           set.add("Pnumber: 7839029584");  
  
	           Iterator<String> i=set.iterator();  
	           //using hasNext()method
	           while(i.hasNext())  
	           {  
	        	   System.out.println(i.next());  
	           }  
	}

}
