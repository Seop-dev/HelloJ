package com.yedam;

/*
 * 라이브러리 클래스
 */
public class Student {
	// 필드(속성)
	private int studentNo;
	private String studentName;
	private double height;
	private int engScore;
	private int mathScore;

	// 생성자(객체:instance의 초기화)
	public Student() {
		// 매개값이 없는 생성자 => 기본 생성자
		// 없어도 컴파일러가 기본으로 생성
	}

	public Student(int studentNo, String studentName) {
		// 첫번째 매개값은 학번 할당
		this.studentNo = studentNo;
		// 두번째 매개값은 이름 할당
		this.studentName = studentName;
	}

	public Student(int studentNo, int engScore, int mathScore) {
		this.studentNo = studentNo;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	// 메소드(기능)
	void study() {
		System.out.println("공부를 합니다.");
	}

	void introduce() {
		System.out.printf("학번은 %d이고 이름은 %s\n", studentNo, studentName);
	}

	// 영어, 수학
	void setEngScore(int engScore) {
		if (engScore < 0 || engScore > 100) {
			return;
		}
		this.engScore = engScore;
	}

	void setMathScore(int mathScore) {
		if (mathScore < 0 || mathScore > 100) {
			return;
		}
		this.mathScore = mathScore;
	}
	
	int getEngScore() {
		return engScore;
	}
	
	int getMathScore() {
		return mathScore;
	}
	
	// 학번, 이름 (setter, getter)
	void setStudentNo(int studentNo) {
		if(studentNo < 0) {
			return;
		}
		this.studentNo = studentNo;
	}
	
	void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	int getStudentNo() {
		return studentNo;
	}
	
	String getStudentName() {
		return studentName;
	}
}
