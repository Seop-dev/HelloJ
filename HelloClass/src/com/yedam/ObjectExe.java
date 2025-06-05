package com.yedam;

import java.util.Scanner;

public class ObjectExe {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("년도를 입력하세요>>> ");
		int year = scn.nextInt();
		
		boolean result = Calender.isLeapYear(year);
		
		if (result) {
			System.out.println(year + "년은 윤년입니다.");
		} else {
			System.out.println(year + "년은 평년입니다.");
		}
		
		scn.close();		
		// "2010년은 평년입니다."
		// "2000년은 윤년입니다."
	}
}
