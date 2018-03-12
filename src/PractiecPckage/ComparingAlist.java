package PractiecPckage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ComparingAlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		for (int i = 5; i >= 0; i--) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i - (i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
	

}


