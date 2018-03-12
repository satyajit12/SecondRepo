package PractiecPckage;

public class Practice {

	
public static int uppercase = 0;
public static int lowerercase = 0;
public static int specialchar = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "satya @#$B UBUn";
for(int i = 0;i<str.length();i++){
	if(Character.isUpperCase(str.charAt(i))){
		uppercase++;
		System.out.println(str.charAt(i));
	}
 if (Character.isLowerCase(str.charAt(i))) {
	 lowerercase++;
	}
		if (Character.isDigit(str.charAt(i))) {
			
			specialchar++;
			System.out.println(str.charAt(i));
			System.out.println("hallo");
		}
	
		
}
System.out.println(uppercase);
System.out.println(lowerercase);
System.out.println(specialchar);

	}

}
