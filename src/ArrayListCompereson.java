import java.util.ArrayList;


public class ArrayListCompereson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("susant");
		list.add("rohan");
		list.add("micha");
		list.add("sata");
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("sata");
		list1.add("vivek");
		list1.add("manoj");
		list1.add("susant");
		
		
		   for (int i=0;i<list1.size();i++) {
	            for (int j=0;j<list.size(); j++) {
	                if(list1.get(i).equals(list.get(j)))
	                    System.out.println("equals.."+list.get(j));
			}
			
		}
					

	}

}
