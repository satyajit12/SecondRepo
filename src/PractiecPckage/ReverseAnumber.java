package PractiecPckage;

public class ReverseAnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*String s = "123";
char[] ch = s.toCharArray();
for(int i=ch.length-1;i>=0;i--){
	char c = s.charAt(i);
	System.out.print(c);
	
}*/
		
		int res=0;
		int n = 123;
		int rem;
		while(n>0){
			rem = n%10;
			n=n/10;
			res= res*10+rem;
		}
		System.out.println(res);

	}

}
