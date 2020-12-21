package lesson2;

import java.util.Scanner;

public class Lesson2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("数値(1~10000)>");
		/*
		int input=sc.nextInt();
		System.out.print("逆順にしました->");
		while(input > 0) {
			int n=input%10;
			System.out.print(n);
			input /=10;
		}
		System.out.println();
		sc.close();
		*/

		String str=sc.next();
		System.out.print("逆順にしました->");
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}

}
