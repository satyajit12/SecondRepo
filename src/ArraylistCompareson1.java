import java.util.ArrayList;


public class ArraylistCompareson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        ArrayList<String> list1 = new ArrayList<String>();
		            list1.add("ab");
		            list1.add("gh");
		            list1.add("fz");
		            list1.add("jk");
		        ArrayList <String>list2 = new ArrayList<String>();
		            list2.add("xy");
		            list2.add("ab");
		            list2.add("fz");
		            list2.add("zx");
		            
		            
		            
		            for (int i=0;i<list2.size();i++) {
		            for (int j=0;j<list1.size(); j++) {
		                if(list2.get(i)==(list1.get(j)))
		                    System.out.println("equals..:"+list1.get(j));
		            }
		        }
		        
	}

}
