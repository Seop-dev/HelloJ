package com.yedam.ref;

public class ArrayExe1 {
	public static void main(String[] args) {

		// Math.random 활용해서 10 ~ 100 사이의 점수를 생성
		// 학생 10명의 점수를 생성해서 학생 점수의 평균을 구하고 최고점수 구하기
		// scoreAry 변수명

//		test1();
//		test2();
//		test3();
		test4();
	}

	public static void test4() {
		int scoreAry[] = new int[10];
		int max = 0;
		int avg = 0;
		int sum = 0;
		// 점수들 난수 생성
		for(int i = 0; i < scoreAry.length; i++) {
			scoreAry[i] = (int)(Math.random() * 101);
			sum += scoreAry[i];
		System.out.println(scoreAry[i]);
		}
		// 평균 구하기
		avg = sum / scoreAry.length;
		System.out.printf("평균 값: %d\n",avg);
		// 최대값 구하기
		for (int i = 0; i < scoreAry.length; i++) {
			if (scoreAry[i] > max) {
				max = scoreAry[i];
			}
		}
		System.out.printf("최대 값: %d", max);
	}

	public static void test3() {
		// 6번 문제
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void test2() {
		// 5번 문제
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void test1() {
		// int배열 => intAry : 10, 17, 22, 31, 55, 24
		int intAry[] = new int[6];
		intAry[0] = 10;
		intAry[1] = 17;
		intAry[2] = 22;
		intAry[3] = 31;
		intAry[4] = 55;
		intAry[5] = 24;
		int temp = 0;

		// 정렬
		for (int j = 0; j < intAry.length - 1; j++) {
			// 큰값기준으로 위치변경
			for (int i = 0; i < intAry.length - 1; i++) {
				if (intAry[0] < intAry[1]) {
					temp = intAry[0];
					intAry[0] = intAry[1];
					intAry[1] = temp;
				}
			}
		}
		// 출력
		for (int i = 0; i < intAry.length; i++) {
			System.out.printf(" i: %d, 값: %d\n", i, intAry[i]);
		}

		// 최대값 구하기
		int max = 0;
		for (int i = 0; i < intAry.length; i++) {
			// max와 배열요소를 비교, 큰값을 max에 저장
			if (intAry[i] > max) {
				max = intAry[i];
			}
		}
		System.out.println(max);

		// 합 구하기
		int sum = 0;
		int cnt = 0; // 횟수
		for (int i = 0; i < intAry.length; i++) {
			if (intAry[i] % 2 == 0) {
				sum += intAry[i];
				cnt++;
				System.out.printf("sum: %d, i: %d 값: %d\n", sum, i, intAry[i]);
			}
		}
		double avg = 1.0 * sum / cnt;
		System.out.printf("평균: %.1f\n", avg);
	}
	// end of main
} // end of class
