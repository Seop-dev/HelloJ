package com.yedam;

import com.yedam.member.Member;

/*
 * 메소드 연습
 * 1) 메소드의 선언
 * 2) 매개변수
 * 3) 반환유형
 */
public class Calculator {
	// 필드
	// 생성자
	// 메소드
	String printStar(int times, String shape){ // 매개변수(times)
		String str = "";
		for(int i = 1; i<=times; i++) {
//			System.out.println(shape);
			str += shape + "\n";
		}
		return str;
	} // end of printStar
	
	// 메소드 오버로딩: 같은 메소드를 여러번 정의
	// 단, 다른 타입으로 정의해야함
	int add(int num1, int num2) {
		return num1 + num2;
	}
	double add(int str1, int str2, int str3) {
		return str1 + str2 + str3;
	}
	
	double add(double num1, double num2) {
		return num1 + num2;
	}
	
	double add(int[] ary) {
		int sum = 0;
		for(int i=0; i<ary.length; i++) {
			sum += ary[i];
		}
		// int -> double 타입 자동반환
		return sum;
	}
	
	// 배열에서 point가 가장 큰 사람을 찾아서 반환
	Member getMaxPoint(Member[] memberArray) {
		// 결과값
		Member max = null; // 아이디, 이름, 연락처, 포인트
		int maxPoint = 0; // 포인트를 비교하기 위한 변수
		for(int i=0; i<memberArray.length; i++) {
			if(memberArray[i].getPoint() > maxPoint) {
				maxPoint = memberArray[i].getPoint(); // 최대 포인트 저장
				max = memberArray[i]; // 해당 회원 저장	
			};
	}
		return max;
		// end of getMaxPoint

} // end of class
}