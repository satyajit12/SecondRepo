package PractiecPckage;

public class FetchOddIndexValues {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s ="bubun";
char[] ch = s.toCharArray();
for(int i=0;i<ch.length;i++){
	if(i%2==0){
		char c = s.charAt(i);
		System.out.println(c);
	}
}

	}

}
