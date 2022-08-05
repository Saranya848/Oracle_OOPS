package List;

import java.util.Iterator;
import java.util.LinkedList;

public class PersonData {

	public static void main(String[] args) {
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Saranya");//Adding object in arraylist    
		al.add("Harsha");    
		al.add("Lakshmi");    
		al.add("Swathi");
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	}

}
