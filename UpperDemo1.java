package com.biswajit.datatype;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UpperDemo1 {

	public static void main(String[] args) throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter a string...");
		String s1 = br.readLine();
		char[] ch = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			ch[0] = Character.toUpperCase(ch[0]);
			if (i < ch.length - 1) {
				continue;
			}
			ch[ch.length - 1] = Character.toUpperCase(ch[ch.length - 1]);
		}
		s1 = new String(ch);

		System.out.print("Result Is: " + s1);
	}

}
