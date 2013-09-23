package Example;

import java.util.Scanner;

public class CountEachLetter {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String:");

		String s = input.nextLine();

		int counts[] = countLetters(s.toLowerCase());
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] != 0) {
				System.out.print((char)('a'+i)+" ");
				System.out.println(counts[i]);
			}
		}
	}

	public static int[] countLetters(String s) {
		int[] counts = new int[26];
		s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				counts[s.charAt(i) - 'a']++;
			}
		}
		return counts;
	}

}
