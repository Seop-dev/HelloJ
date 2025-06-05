package com.yedam.ref;

import java.util.Scanner;

public class homeworkN1 {
	static Student[] scores = null;

	public static void main(String[] args) {
		init(); // 초기데이터 생성
		
		boolean run = true; // 반복문 실행/종료
		int studentNum = 0; // 학생수
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 정보입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택>");
			// 숫자 입력받기
//			int num = scanner.nextInt();
			int num = Integer.parseInt(scanner.nextLine());
			if (num == 2 || num == 3 || num == 4) {
				if (scores == null) {
					System.out.println("학생 수를 지정하세요");
					continue;
				}
			}

			if (num == 1) { // 학생수 지정
				System.out.print("학생수>");
//				student = scanner.nextInt();
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new Student[studentNum]; // 배열의 크기 지정
				if (studentNum == 0) { // 학생 수를 0으로 입력했을때 예외 처리
					System.out.println("1명 이상부터 입력가능합니다");
					continue;
				} // 배열의 크기 지정
			} else if (num == 2) { // 점수, 이름 입력
//				if (scores == null) {
//					System.out.println("학생수를 지정하세요");
//					continue;
//				}
				for (int i = 0; i < scores.length; i++) {
//					System.out.print("[" + i + "]의 점수입력>");
//					scores[i] = scanner.nextInt();
					System.out.printf("scores[%d] 이름>> ", i);
					String name = scanner.nextLine(); // 이름 저장
					System.out.printf("scores[%d] 점수>> ", i); // 점수 저장
					int score = Integer.parseInt(scanner.nextLine());
					System.out.printf("scores[%d] 키>> ", i); // 키 저장
					double height = Double.parseDouble(scanner.nextLine());
					System.out.printf("scores[%d] 성별>> ", i); // 성별 저장
					String gender = scanner.nextLine();
					Gender gen = Gender.MALE;
					if(gender.equals("남") || gender.equals("남자")) {
						gen = Gender.MALE;
					} else if(gender.equals("여") || gender.equals("여자")) {
						gen = Gender.FEMALE;
					}
					

					// 인스턴스 생성
					Student student = new Student();
					student.studentName = name;
					student.score = score;
					student.height = height;
					student.gender = gen;
					scores[i] = student;
				}
			} else if (num == 3) { // 점수 리스트
				int sum = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i].score;
				}

				if (sum == 0) {
					System.out.println("점수를 입력하세요");
					continue;
				}
				System.out.println("검색조건 ex)남 or 여");
				String keyword = scanner.nextLine(); // "남" , "여", "엔터"
				Gender gen = Gender.MALE; // 초기화
				if(keyword.equals("남") || keyword.equals("남자")  || keyword.equals("Men")|| keyword.equals("M")) {
					gen = Gender.MALE;
				} else if(keyword.equals("여") || keyword.equals("여자") || keyword.equals("Women")|| keyword.equals("W")){
					gen = Gender.FEMALE;
				}

				// 이름, 점수 출력
				for (int i = 0; i < scores.length; i++) {
					if (keyword.equals("") || gen == scores[i].gender) {
						System.out.printf("[%d]번째 학생 정보> 이름: %s, 점수: %d, 키: %.1f, 성별: %s\n", i, scores[i].studentName,
								scores[i].score, scores[i].height, scores[i].gender);
					}
				}

			} else if (num == 4) { // 최대값 평균값 구하기
//				if (scores == null) {
//					System.out.println("학생수를 지정하세요");
//					continue;
//				}
				int bestScore = scores[0].score;
				String bestName = scores[0].studentName;
				int totalSum = 0;
				Student maxStd = new Student(); // 최고점수를 받은 학생의 정보를 저장.

				for (int i = 0; i < scores.length; i++) {
					totalSum += scores[i].score;
					if (bestScore < scores[i].score) {
						maxStd.score = scores[i].score;
						maxStd.studentName = scores[i].studentName;
					}
				}

//				double totalAvg = (double) totalSum / scores.length;
				double totalAvg = 1.0 * totalSum / scores.length;
				System.out.println("최고 점수: " + bestScore + " (" + bestName + ")");
				System.out.printf("평균 점수: %.2f\n", totalAvg);
			} else {
				run = false;
				System.out.println("end of prog");
			}
		}
	}

	public static void init() {
		Student s1 = new Student(); // 인스턴스 생성
		s1.studentName = "홍길동";
		s1.score = 80;
		s1.height = 170.8;
		s1.gender = Gender.MALE; // "남자", "Men"

		Student s2 = new Student(); // 인스턴스 생성
		s2.studentName = "김민선";
		s2.score = 85;
		s2.height = 165.7;	
		s2.gender = Gender.FEMALE;

		Student s3 = new Student(); // 인스턴스 생성
		s3.studentName = "박철민";
		s3.score = 90;
		s3.height = 180.3;
		s3.gender = Gender.MALE;

		// 초기 데이터
		scores = new Student[] { s1, s2, s3 };

	}
}
