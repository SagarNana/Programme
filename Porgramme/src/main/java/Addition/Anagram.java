package Addition;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "HRADHAYA";
		String y = "ARADAHYA";

		char a[] = x.toCharArray();
		char b[] = y.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		boolean result = Arrays.equals(a, b);

		if (result = true) {
			System.out.println("Print the string is equal");
		} else {
			System.out.println("Print the string are not equal ");
		}

	}

}
