package assignment4;

public class Question3 {

	public static void main(String args[]) {
		String[] strArr = { "1", "2", "3", "4","5","6","7","8" };

		StringBuilder strBuilder = new StringBuilder();

		for (int i = 0; i < strArr.length; i++) {

			strBuilder.append(strArr[i]);
		}
		String newString = strBuilder.toString();
		System.out.println("concatenate all elements of a string array " + newString);
	}

}
