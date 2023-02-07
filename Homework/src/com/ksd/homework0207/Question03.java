package com.ksd.homework0207;

import java.util.Scanner;

public class Question03 {
	public static void main(String[] args) {
		//3) 중복되는 문자가 없는 문자열에서 두 문자사이의 거리 구하기
		//조건 : 입력되는 두 문자를 제외한 가운데 문자의 갯수를 두 문자간 거리로 한다.
		//예시)
		//-> 입력 : "abcdefghijklmnopqrstuvwxyz"
		//-----------------------------------
		//-> 입력 : 첫번째 문자 : c
		//-> 입력 : 두번째 문자 : f
		//-> 출력 : 두 문자간의 거리 : 2
		//------------------------------------
		//-> 입력 : 첫번째 문자 : e
		//-> 입력 : 두번째 문자 : a
		//-> 출력 : 두 문자간의 거리 : 3
		
		Scanner sc = new Scanner(System.in);
		
		String str = "abcdefghijklmnopqrstuvwxyz";
		
		//문자 입력받기
		System.out.println("입력 : ");
		String firstStr = sc.nextLine();
		System.out.println("입력 : ");
		String secondStr = sc.nextLine();
		
		
		//두 문자 간 거리 구하기
		// 두 문자 간 거리
		int distance = 0; 
		if(str.indexOf(firstStr) < str.indexOf(secondStr)) {
			distance = str.indexOf(secondStr) - str.indexOf(firstStr) - 1 ;
		}else if(str.indexOf(firstStr) > str.indexOf(secondStr)) {
			distance = str.indexOf(firstStr) - str.indexOf(secondStr) - 1;
		}
		
		//출력
		System.out.println("첫번째 문자 : " + firstStr);
		System.out.println("첫번째 문자 : " + secondStr);
		System.out.println("두 문자 간의 거리 : " + distance);
		System.out.println("----------------------------------------");
		

		
	}	
}
