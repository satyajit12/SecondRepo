public class UpperDemo {

	public static void main(String[] args) {
		String s1 = "satyajit";

		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			ch[0] = Character.toUpperCase(ch[0]);
			if (i < ch.length-1) {
				continue;
			}
			ch[ch.length-1] = Character.toUpperCase(ch[ch.length-1]);
		}
		s1 = new String(ch);

		System.out.print("Result Is: " + s1);
	}

}
