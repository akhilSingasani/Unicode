package types;

import java.util.Scanner;

public class UnicodeToChar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Unicode number");
		short u = sc.nextShort();
		char ch=(char)u;
		System.out.println("Unicode character Code is="+ch);
		sc.close();
	}

}
