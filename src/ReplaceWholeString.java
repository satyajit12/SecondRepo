
public class ReplaceWholeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		
char ch[] = s.toCharArray();
for(int i=0;i<s.length();i++){
	ch[i] = s.charAt(i);
	if(ch[i]== 'a'){
		ch[i] ='x';
	}
	else if (ch[i] =='b') {
		ch[i] = 'y';
		 
	}
	else if (ch[i] == 'c'){
		ch[i] = 'z';
	}
		System.out.print(ch[i]);
	
}
	}

}
