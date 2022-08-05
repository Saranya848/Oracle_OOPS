package set;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeDetails {

	public static void main(String[] args) {
		//Creating HashSet and adding elements  
	    HashSet<String> set=new HashSet();  
	           set.add("Name: Harsha");    
	           set.add("City: Vizag");    
	           set.add("Pincode: 539504");   
	           set.add("Pnumber: 7839029584");  
  
	           Iterator<String> i=set.iterator();  
	           while(i.hasNext())  
	           {  
	           System.out.println(i.next());  
	           }  
	}

}
