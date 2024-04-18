package assignment4;
import java.util.Scanner;

class NoVowels extends Exception {
	public NoVowels(String str) {
		super(str);

	}

}

public class Question8 {
	public static void checkVowels(String str) throws NoVowels {
		boolean containsVowels = false;
		String vowel = "AEIOUaeiou";
		for (int i = 0; i < str.length(); i++) {
			char test = str.charAt(i);
			if (vowel.contains(String.valueOf(test))) {
				containsVowels = true;
				break;
			}
		}
		if (!containsVowels) {
			throw new NoVowels("This String does not contains any vowels");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the String :");
		Scanner sc = new Scanner(System.in);
		try {
			String str = sc.next();
			checkVowels(str);
			System.out.println("The String contains Vowels");
		} catch (NoVowels e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}

