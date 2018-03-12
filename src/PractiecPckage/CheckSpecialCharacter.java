package PractiecPckage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "bubun$";
		Pattern y =  Pattern.compile("^\\p{punct}|\\p{punct}$");
		Matcher b = y.matcher(s);
		
		
		boolean x=b.find();
		//System.out.println(x);
if(!x){
	System.out.println("false");
}
	}

}
