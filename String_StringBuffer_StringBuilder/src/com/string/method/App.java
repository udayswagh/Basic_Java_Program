package com.string.method;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter valid city name");
		
		String s=sc.nextLine().toLowerCase().trim();
		
		if(s.equals("hydrabad")) {
			System.out.println("welcome to hyderabad");
		}
		else if(s.equals("maharashtra")) {
			System.out.println("welcome to maharshtra");
		}
		else if(s.equals("chennai")) {
			System.out.println("welcome to chennai");
			
		}
		else{
			System.out.println("enter VALID CITY");
		}
	}

}
