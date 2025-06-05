package com.yedam.collection.app;

/*
 * 항목(아이디, 이름, 전화번호, 포인트)
 * - 아이디 : admin, guest, limp1, user01
 * - 이름 : 홍길동, 김말숙
 * - 전화번호 : 010-1212-3434
 * - 포인트 : 10000
 */

public class Member {
	// 필드
	private String memberId;
	private String memberName;
	private String phone;
	private int point;

	// 생성자
	public Member() {
	}

	public Member(String memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public Member(String memberId, String memberName, String phone, int point) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.phone = phone;
		this.point = point;
	}

	void start() {
		System.out.println("--------------------------------------------");
		System.out.println("1.추가 2.수정 3.삭제 4.조회 5.종료");
		System.out.println("--------------------------------------------");
		System.out.print("선택>> ");
	}

	// 메소드(getter, setter)
	String getMemberId() {
		return memberId;
	}

	void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	String getMemberName() {
		return memberName;
	}

	void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	String getPhone() {
		return phone;
	}

	void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPoint() {
		return point;
	}

	void setPoint(int point) {
		this.point = point;
	}
	
	// 이름, 연락처, 포인트 출력 메소드
	public void showInfo() {
		System.out.printf("이름은 %s, 연락처는 %s, 포인트는 %d\n", memberName, phone, point);
	}
}

