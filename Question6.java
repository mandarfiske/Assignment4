package assignment4;

import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		try {
			System.out.println("Enter the element to Search ");
			int a=sc.nextInt();
			System.out.println(arr[a]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Not found");
			System.out.println(e.getMessage());
		}
		
	}

}
