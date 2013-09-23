package Example;

import java.util.Scanner;

public class JudgeWeatherHuiwenOrNot {
	private static StringBuilder sb = new StringBuilder();

	public enum Status {
		NOTEQAULS, EQAULS
	}

	public static void main(String[] args) {
		System.out.println("Enter letter:");
		Scanner input = new Scanner(System.in);
		String myinput = input.nextLine();
		System.out.println(filter(myinput));

		System.out.println(isHuiwenOrNot());

	}

	public static Status isHuiwenOrNot() {
		String originString = sb.toString();
		String secondString = sb.reverse().toString();
		if (secondString.equals(originString)) {
			return Status.EQAULS;
		}
		return Status.NOTEQAULS;
	}

	public static String filter(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}

}
