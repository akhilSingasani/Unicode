package types;

import java.util.Scanner;

public class CharToUnicode {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Unicode number");
		char u = sc.next().charAt(0);
		int ch=(char)u;
		System.out.println("Unicode character Code is="+ch);
		sc.close();

	}

}
