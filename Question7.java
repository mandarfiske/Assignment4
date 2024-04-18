package assignment4;

import java.util.StringTokenizer;

public class Question7 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hello World");
		String token1 = st.nextToken();
		System.out.println(token1);
		String token2 = st.nextToken();
		System.out.println(token2);

		try {
			String token3 = st.nextToken();
			System.out.println(token3);

		} catch (Exception e) {
			System.out.println("No additional tokens to show ");
		}

	}

}
