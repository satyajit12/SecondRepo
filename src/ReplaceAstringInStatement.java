
public class ReplaceAstringInStatement {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String s = new String("bubun is a good boy");
String[] ary = s.split(" ");
System.out.println();
//for(String gfj: ary){
String s1 = s.substring(10,15);
	System.out.println(s1);
//System.out.println(gfj);
//}
for(int i =0;i<ary.length;i++){
	//System.out.println(ary[i]);
	if(ary[i]==ary[3])
		ary[3]="bad";
	System.out.print(ary[i]);
			
		
}
	

}

	

}

	


