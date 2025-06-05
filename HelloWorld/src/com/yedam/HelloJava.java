package com.yedam;

// 들여쓰기 내어쓰기 단축키 = ctrl+shift+f
public class HelloJava {
	public static void main(String[] args) {
		// JAVA 변수들 : int(정수), double(실수), boolean(참과 거짓)
		int num1 = 10; // 초기화
		double num2 = 20; // 자동형변환(promotion)

		num1 = (int) num2; // 강제형변환(casting)

		int num3 = 100;
		double num4 = 200;

		double result = (double) num3 + num4;
		System.out.println("결과는 " + result);
		
		// 20 + 30 => 50
		System.out.println("결과는 " + (20 + 30)); // 같은 데이터 타입으로 연산해야함
	}
}
