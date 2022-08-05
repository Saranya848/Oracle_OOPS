package List;

import java.util.ArrayList;
import java.util.Collections;

public class PersonDetails {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Saranya");//Adding object in arraylist    
	      list.add("Harsha");    
	      list.add("Lakshmi");    
	      list.add("Swathi");    
	      //Printing the arraylist object   
	      System.out.println("List before sorting" +list);  
	      //Sorting the list  
	      Collections.sort(list);
	      System.out.println("List after sorting" +list);  
	      
	}

}
