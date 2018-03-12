package bubun;

public class ComparesonOfTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "raamk";
String s1 = "ram";
int count=0;
char[] ch = s.toCharArray();
char[] ch1 = s1.toCharArray();
for(int i =0;i<ch.length;i++){
	for(int j = ch.length-1;j>i;j--){
		if(ch[i]==ch[j]){
		count = count + j;
		System.out.println("count");
		}
	}
}
	
			
		}

	}
	




