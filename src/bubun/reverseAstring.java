package bubun;

public class reverseAstring {
	String a ="bubun";
	int i;
public void reverse(){
int k = a.length();
System.out.println(k);
char[] ch = new char[k];
for( i=0;i<k;i++){
	ch[i]=a.charAt(i);
	System.out.print(ch[i]);
	
}
for( i=ch.length-1;i>=0;i--){
	ch[i]= a.charAt(i);
	System.out.println(ch[i]);
	
}


}

	public static void main(String[] args) {
reverseAstring b = new reverseAstring();
b.reverse();
	}


}
