package com.bridgelabz;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		int year;
		System.out.println("Enter a Year : ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("This year is Leap Year");
		} else
			System.out.println("This year is not a Leap Year");

	}
}
