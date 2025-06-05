package com.yedam.api;

public class Member extends Object{
	private String memberName;
	int age;
	
	public Member() {}
	public Member(String memberName, int age) {
		this.setMemberName(memberName);
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return age;
	}
	
	// 이름, 점수 => 같으면 논리적으로 동등한지
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { // 매개값의 유형이 Member 이어야함.
			Member member = (Member) obj;
			return this.getMemberName() == member.getMemberName()
					&& this.age == member.age;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return "이름: " + getMemberName() + ", 나이: " + age;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
}
