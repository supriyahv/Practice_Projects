package Array_Programs;

public class duplicate_number_array {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,1,3,4,4};//find duplicate number from array
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]==a[j]) {//equals() 
					System.out.println(a[i]);
				}
			}
		}
	}

}
