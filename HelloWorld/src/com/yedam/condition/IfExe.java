package com.yedam.condition;

import java.util.Scanner;

public class IfExe {
	public static void main(String[] args) {
//		test();
		test1();
		// 1 ~ 1000 사이 임의의 값을 생성 randomValue =
		// 임의의 값 맞추기
		// 더 큰값 입력하면 "입력값보다 큽니다"
		// 작은 값 입력하면 "입력값 보다 작습니다"
		// 몇번의 시도에 정답을 맞췄는가
		// "정답입니다" 프로그램 종료
	}
	public static void test1() {
		Scanner scn = new Scanner(System.in);
		int randomValue = 0;
		int count = 0;
		randomValue = (int)(1+ Math.random() * 1001);
		System.out.println(randomValue);
		while(true) {
			System.out.println("정답을 입력하세요>>");
			String try1 = scn.nextLine();
			int gamble = Integer.parseInt(try1);
			if (gamble < 1 || gamble >= 1000) {
				System.out.println("1부터 1000까지 숫자 입력");
				continue;
			}
			count++;
			
			if (randomValue < gamble) {
				System.out.println("입력값 보다 작습니다");
			} else if (randomValue > gamble) {
				System.out.println("입력값 보다 큽니다");
			} else {
				System.out.println("정답입니다.\n 시도횟수는" + count +"번 입니다." );
				break;
			}
		}
	}
	
	
	public static void test() {
		int score = 90;

		// if
//	if (score >= 90) {
//		System.out.println("A학점");
//	} else if (score >= 80) {
//		System.out.println("B학점");
//	} else if (score >= 70) {
//		System.out.println("C학점");
//	} else {
//		System.out.println("불합격");
//	}

		// switch
		score = score / 10;
		switch (score) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		default:
			System.out.println("불합격");
		}// end of switch
	}
}
