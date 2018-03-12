import java.util.HashSet;


public class stringComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a={"bubun","tubun","vikram"};
		String[] b={"tubun","vhd","kiss"};
		 HashSet<String> set = new HashSet<String>();
		 for(int i=0;i<a.length;i++){
			 for(int j=0;j<b.length;j++){
				 if(a[i].equals(b[j])){
					 set.add(a[i]);
				 }
					 
			 }
			 
		 }
		System.out.println(set);
	}

}
