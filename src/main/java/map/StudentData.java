package map;

import java.util.HashMap;
import java.util.Map;

public class StudentData {

	public static void main(String[] args) {
		// Creating object for Map.
        Map<Integer, String> map
            = new HashMap<Integer, String>();
        
     // Adding Elements using Map.
        map.put(30, "Harsha");
        map.put(30, "Swathi");
        map.put(49, "Lakshmi");
 
        // Elements can traverse in any order
        for (Map.Entry m : map.entrySet()) 
        {
            System.out.println(m.getKey() + " "
                               + m.getValue());
        }
	}

}
