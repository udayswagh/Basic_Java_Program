package strignbuilder;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		String s2 = sc.nextLine();
//
//		String reverse = "";
//
//		for (int i = s2.length() - 1; i >= 0; i--) {
//			reverse = reverse + s2.charAt(i);
//
//		}
//		System.out.println(reverse);
		
	
		String input = "uday wagh";
		String reverse=" ";
		
		String[] s1=input.split("");
		
		for(int i=input.length()-1;i>=0;i--) {
			reverse=reverse+input.charAt(i);
		}
		System.out.println(reverse);

	}

}
