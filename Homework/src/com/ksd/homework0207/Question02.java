package com.ksd.homework0207;

import java.io.IOException;
import java.util.Scanner;
//import java.util.Scanner;

public class Question02 {
	public static void main(String[] args) throws IOException {
		// 2) 문자열 개수 세기
		//-> 입력 문자열에서 알파벳, 숫자, 공백의 개수를 구하시오.
		//예시)
		//-> 입력 : 1a2b3c4d 5e
		//-> 출력 : 문자 :5개, 숫자:5개, 공백 : 1개
		
		
		boolean run = true;
		int keyCode;
		int a = 0; //숫자 개수
		int b = 0; //문자 개수
		int c = 0; //공백 개수
		
		while(run) {
			//키코드 읽기
			keyCode = System.in.read(); 
			int n = keyCode/10;
			//0~9 : 48~57
			if(keyCode>=48 && keyCode<=57) { 
				a += 1;
			//A~z : 65~122
			}else if((keyCode<=97 && keyCode>= 65) || (keyCode <= 122 && keyCode>= 65)) {
				b += 1;
			//공백 : 32
			}else if(keyCode == 32 ) {
				c += 1;
			//엔터 : 13,10
			}else if(keyCode == 13) {
				run = false;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("숫자:" + a + "개, 문자:"+ b + "개, 공백:" + c);
		
		//1a2b3c4d 5e
		for (int i = 0; i < str.length(); i++) {
			char tempStr = str.charAt(i);

			if (tempStr == 32) {
				c++;
			} else if (tempStr >= 48 && tempStr <= 57) {
				a++;
			} else if (tempStr >= 97 && tempStr <= 122) {
				b++;
			}
		}
		System.out.println("숫자 : " + a + "개, 문자 : " + b + "개, 공백 : " + c);
		
		
		
		
		
		
		
		
		
	}
}
