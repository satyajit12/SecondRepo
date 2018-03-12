package PractiecPckage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountduplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "harrrriiiii";
char[] ch = s.toCharArray();
LinkedHashMap<Character, Integer> li = new LinkedHashMap<Character,Integer>();
for(int i=0;i<ch.length;i++){
	char c = s.charAt(i);
  Integer val=li.get(c);
  if(val==null){
	  li.put(c, 1);
  }
  else {
	  li.put(c, val+1);
  }
 
 
	 
  /*for (li.Entry<Character, Integer> e : li.entrySet()) {
	  System.out.println(e.getKey() + " =" + e.getValue()); }*/
 
  
  
}
//System.out.println(li);
//for(int j=0;j<li.size();j++){
	//if(li.get(j)>1){
		//System.out.println(li.get(j));
/*Set set = li.keySet();
Iterator iterator = set.iterator();
while (iterator.hasNext()) {
	Character c = (Character) iterator.next();
	System.out.print(c.charValue() + " =");
	System.out.println(li.get(ch));*/

for(Entry<Character, Integer> e:li.entrySet()){
	//System.out.println(e.getKey());
	if(e.getValue()>1){
		System.out.println(e.getKey()+"="+e.getValue());
	}
}
	
}


		
	}




