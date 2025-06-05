package com.yedam.ref;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true; // 반복문 실행/종료
		int student = 0; // 학생수
		int[] scores = null; // 학생 점수 저장

		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택>");
			// 숫자 입력받기
//			int num = scanner.nextInt();
			int num = Integer.parseInt(scanner.nextLine());
			if ( num == 2 || num == 3 || num == 4) {
				if(scores == null) {
					System.out.println("학생 수를 지정하세요");
					continue;
				}
			}
			
			if (num == 1) { // 학생수 지정
				System.out.print("학생수>");
//				student = scanner.nextInt();
				student = Integer.parseInt(scanner.nextLine());
				scores = new int[student];
				if (student == 0) { // 학생 수를 0으로 입력했을때 예외 처리
					System.out.println("1명 이상부터 입력가능합니다");
					continue;
				}// 배열의 크기 지정
			} else if (num == 2) { // 점수 입력
//				if (scores == null) {
//					System.out.println("학생수를 지정하세요");
//					continue;
//				}
				for (int i = 0; i < scores.length; i++) {
					System.out.print("[" + i + "]의 점수입력>");
//					System.out.printf("scores[%d]> ", i);
//					scores[i] = scanner.nextInt();
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
			} else if (num == 3) { // 점수 리스트
//				if (scores == null) {
//					System.out.println("학생수를 지정하세요");
//					continue;
//				}
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
				}
				
				if (sum==0) {
					System.out.println("점수를 입력하세요");
					continue;
				}
				
				
				for (int i = 0; i < scores.length; i++) {
					System.out.println("[" + i + "]의 점수:" + scores[i]);
				}
				
			} else if (num == 4) { // 최대값 평균값 구하기
//				if (scores == null) {
//					System.out.println("학생수를 지정하세요");
//					continue;
//				}
				int bestScore = 0;
				int totalSum = 0;

				for (int i = 0; i < scores.length; i++) {
					totalSum += scores[i];
					if (bestScore < scores[i]) {
						bestScore = scores[i];
					}
				}
				
				double totalAvg = (double) totalSum / student;
				System.out.println("최고 점수:" + bestScore);
				System.out.println("평균 점수:" + totalAvg);
			} else {
				run = false;
				System.out.println("end of prog");
			}
		}
	}
}