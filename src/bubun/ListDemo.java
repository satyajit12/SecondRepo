package bubun;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> al = new ArrayList<Integer>();
al.add(20);
al.add(10);
al.add(30);
al.add(40);
int sum=0;
for(int i=0;i<al.size()-1;i++){
	sum=sum+al.get(i);		
}


System.out.println(al.size());
al.add(new Integer(sum));

System.out.println(al.size());
System.out.println(al.get(4));

if(sum==al.get(4)){
	System.out.println("Success...");
}

	}

}
