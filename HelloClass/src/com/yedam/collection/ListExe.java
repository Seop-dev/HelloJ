package com.yedam.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.yedam.api.Member;

/*
 * 인덱스를 사용해서 객체를 관리
 * 순서를 가지고 중복된 값 가능
 */
public class ListExe {
	public static void main(String[] args) {
		// 10 ~ 100 점 점수를 임의의 값으로 생성
		// 정수 10개 생성
		List<Integer> numbers = new ArrayList<>();
		// 정수 10개를 저장할 리스트 생성
				List<Integer> numbers1 = new ArrayList<>();

				// 랜덤 객체
				Random rand = new Random();

				// 10 ~ 100 사이의 정수 10개 생성 및 리스트에 추가
				for (int i = 0; i < 10; i++) {
					int num = rand.nextInt(91) + 10; // 0~90 + 10 = 10~100
					numbers1.add(num);
				}

				// 합계 및 평균 계산
				int sum = 0;
				for (int num : numbers1) {
					sum += num;
				}
				double avg = sum / 10.0;
				
				// 출력
				System.out.println("생성된 점수: " + numbers1);
				System.out.println("합계: " + sum);
				System.out.println("평균: " + avg);
			}

		public static void exe2() {
		List<Member> members = new ArrayList<>();
		
		Member member = new Member("김홍동", 20);
		
		members.add(new Member("홍길동", 10));
		members.add(member);
		members.add(new Member("김홍도", 30));
		
		// 삭제
//		members.remove(member);
		
		String search = "김홍동";
		for(int i=0; i<members.size(); i++) {
			if(members.get(i).getMemberName().equals(search)) {
				
			}
		}
		
		for(int i=0; i<members.size(); i++) {
			System.out.println(members.get(i).toString());
		}
		
	}
	
	public static void exe1() {
		// 인터페이스           - 구현클래스
		List<String> list = new ArrayList<String>();
		list.add("10");
		list.add(new String("Hello"));
		
		list.add(1, "20"); // 위치지정
		
		// 삭제
		list.remove(0);
		
		// 변경
		list.set(1, "World");
		
		for(int i=0; i<list.size(); i++) {
			
		}
		
		for(Object item : list) {
			String result = (String) item;
			System.out.println(result);
		}
	}
}
