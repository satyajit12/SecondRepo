package PractiecPckage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//OCCOURANCE OF CHARACTERS IN A STRING
public class OccouranceOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "bubun";
		int len = str.length();
		LinkedHashMap<Character, Integer> link = new LinkedHashMap<Character,Integer>();
		for(int i = 0;i<len;i++){
			char c = str.charAt(i);
			Integer value = link.get(c);
			//System.out.println(value);
			if (value==null) {
				link.put(c, 1);
			} else {
              link.put(c, value+1);
			}
		}
		
		System.out.println(link);
		
	}

}
