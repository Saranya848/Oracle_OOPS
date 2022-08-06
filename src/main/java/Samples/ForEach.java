package Samples;

import java.util.ArrayList;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		List<String> subList = new ArrayList<String>();
        subList.add("Blue");
        subList.add("Pink");
        subList.add("Yellow");
        subList.add("Black");
        System.out.println("------------Color List--------------");
        subList.forEach(sub -> System.out.println(sub));
	}

}
