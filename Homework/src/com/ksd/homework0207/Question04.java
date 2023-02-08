package com.ksd.homework0207;

import java.util.Scanner;

public class Question04 {
	public static void main(String[] args) {
		//4) 중복문자 제거
		//입력 : aaabbccceedddd
		//출력 : abcd
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 > ");
		String str = sc.nextLine();
		
		//indexOf, charAt
		//aaabbccceedddd
		//charAt(0) ~ charAt(문자열.length()-1)
		//charAt(0) -> a
		//indexOf(a) -> a의 위치 -> index:0
		//indexOf(charAt(i)) == i
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			if(str.indexOf(str.charAt(i))==i) {
				System.out.println(i);
				sb.append(str.charAt(i));				
			}
		}
		System.out.println(sb);
		
		
	}
}
