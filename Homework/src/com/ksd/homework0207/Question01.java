package com.ksd.homework0207;

import java.util.Scanner;

public class Question01 {
	public static void main(String[] args) {
		//1) 세 개의 단어를 입력 받아 그 중 가장 짧은 단어와 길이 리턴하기
		//예시 )  입력> tiger
		//입력> lion
		//입력> rabbit
		//출력> 가장 짧은 단어는 lion이며, 길이는 4 입니다
		
		
		Scanner sc = new Scanner(System.in);
		String wordMin = null;
		//
		for(int i=1; i<=3; i++) {
			System.out.println("입력 > ");
			String word = sc.nextLine();
			wordMin = word;
			if(word.length() > wordMin.length()) {
				wordMin = word;
			}
		}
		System.out.println("가장 짧은 단어는 " + wordMin + "이며, 길이는 " + wordMin.length() + "입니다.");
	}
}
