package Collection_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverse_list {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("yellow");
		list.add("blue");
		list.add("green");
		System.out.println(list);
		//Reverse the list 
//		Collections.reverse(list);
//		System.out.println(list);//reverse order
		
		//Reverse the list without using inbuild method
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+" ");
		}
		
	}

}
