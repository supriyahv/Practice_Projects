package Array_Programs;

import java.util.LinkedHashSet;

public class remove_duplicate_array {
	
	public static void main(String[] args) {
		
	
	
	  int[] a={1,2,1,3,1,2,4};	//remove duplicate number from array
      LinkedHashSet<Integer> set=new LinkedHashSet<>();
      for(int i=0;i<a.length;i++){
          set.add(a[i]);
      }
      System.out.println(set);
  }

}

