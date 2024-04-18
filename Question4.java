package assignment4;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.next();
		String str1=str;
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(str1.equals(rev))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not Palindrome");

	}

}
