package com.ksd.homework0208;

import java.util.Scanner;

public class StringGame {
	Scanner sc = new Scanner(System.in);
	
	//필드
	String startStr;
	String checkStr;
	String inputStr;
	
	//생성자
	
	//메소드
	public void setCharData() {
		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		System.out.println(checkStr);
		
		System.out.print("입력값>>");
		String inputStr = sc.nextLine();

		if(inputStr.indexOf("startStr") != 1) {
			System.out.println("문자열을 구성하는 문자입니다.");
			
		} else{
			System.out.println("문자열을 구성하는 문자가 아닙니다.");
		}
	}
	
	public void setStrData() {
		
	}
	
	public void showCharData() {
		
	}
	
	public void init() {
		
	}
	
}
