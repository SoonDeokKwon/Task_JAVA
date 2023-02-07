package com.ksd.homework0207;

public class Question04 {
	public static void main(String[] args) {
		//4) 중복문자 제거
		//입력 : aaabbccceedddd
		//출력 : abcd
		
		String str = "aaabbccceedddd";
		System.out.println(str.length());
		
		if(str.charAt(0) == str.charAt(1)) {
			System.out.println("같은 문자");
		}else {
			System.out.println("다른 문자");
		}
		
		
//		String noRepeatStr = null;
//		for(int i=0; i <= str.length(); i++) {
//			noRepeatStr += str.substring(i,i-1);
//		}
//		System.out.println(noRepeatStr);
		
	}
}
