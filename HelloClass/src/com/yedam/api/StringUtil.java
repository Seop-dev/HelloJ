package com.yedam.api;

public class StringUtil {
	
	// 성별 반환 메소드
	// 1) 주민등록번호에서 성별을 반환
	    public static String getGender(String id) {
	        // 공백, 하이픈 제거
	        id = id.replace(" ", "").replace("-", "");

	        // 7번째 문자 확인 (index 6)
	        char genderCode = id.charAt(6);

	        if (genderCode == '1' || genderCode == '3') {
	            return "남성";
	        } else if (genderCode == '2' || genderCode == '4') {
	            return "여성";
	        } else {
	            return "알 수 없음";
	        }
	    }

	    // 2) 파일 확장자 추출
	    public static String getExtName(String filePath) {
	    	
	        int dotIndex = filePath.lastIndexOf(".");
	        if (dotIndex != -1 && dotIndex < filePath.length() - 1) {
	            return filePath.substring(dotIndex + 1); // 점 다음부터 끝까지
	        } else {
	            return "확장자 없음";
	        }
	    }
	    
	    public static String getfileName(String filePath) {
	    	int slIndex = filePath.lastIndexOf("/");
	    	if(slIndex != -1 && slIndex < filePath.length() -1) {
	    		return filePath.substring(slIndex + 1);
	    	} else {
	    		return "이름 없음";
	    	}
	    }
}
