package bubun;

public class ReverseAstringWithoutUsingLengthfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "satyajit";

		char[] ch = s1.toCharArray();
		//for (int i = 0; i < ch.length; i++) {
        //ch[i] = s1.charAt(i);
        //System.out.println(ch[i]);
			
			System.out.println(ch.length);
	//}
		for(int i=ch.length-1;i>=0;i--){
			ch[i] = s1.charAt(i);
			System.out.print(ch[i]);
		}

}
}

