package PractiecPckage;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bubun";
		int k;
		char[] ch = s.toCharArray();
		System.out.println( k =ch.length);
		for(int i=ch.length-1;i>=0;i--){
			ch[i] = s.charAt(i);
			System.out.print(ch[i]);
		}

	}

}
