package task;

import java.util.Arrays;
import java.util.Scanner;

public class homework_230131 {

	public static void main(String[] args) {
		
		//주어진 배열을 이용하여 다음 내용을 구현하세요.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		
		//문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		int index1 = 0;
		for(int i=0; i < arr1.length; i++) {
			if(arr1[i] == 60) {
				index1 = i;
			}
		}
		System.out.println("값이 60인 곳의 인덱스 : " + index1);

		
		//문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		for(int i = 0; i < arr1.length; i++) {
			if(i != 3) {
				System.out.println(arr1[i]);
			}
		}

		
		//문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
  		//   입력) 인덱스: 3 ->   {10, 20, 30, 1000, 3, 60, -3}
		Scanner sc = new Scanner(System.in);
		
		int input = Integer.parseInt(sc.nextLine());
		for(int i =0; i < arr1.length; i++) {
			if(i == input) {
				arr1[i] = 1000;
			}
		}
		System.out.println(Arrays.toString(arr1));

		
		//문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
		int max = arr1[0];
		int min = arr1[0];
		
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] > max) {
				max = arr1[i];
			}else if(arr1[i] < min) {
				min = arr1[i];
			}
		}
		System.out.println("최대값 : " + max + "\t" + "최소값 : " + min);

		
		//문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		int [] arr2 = new int[10];
		
		for(int i =0; i< arr2.length; i++) {
			int num1 = Integer.parseInt(sc.nextLine());
			arr2[i]= num1;
		}
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i] % 3 == 0) {
				System.out.println(arr2[i]);
			}
		}
		

		// 추가 문제]
		// answer 배열에 담긴 데이터를 읽고 각 숫자마다 개수만큼'*'를 찍는다.
		// 아래 빈 영역에 코드를 입력하여 프로그램을 완성하여라
	
		//	public static void main(String[] args) {
		
		
				int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
				int[] counter = new int[4];
		
				for (int i = 0; i < answer.length; i++) {
					int index = 0;
					
				
				}
				for (int i = 0; i < counter.length; i++) {
					/* 해당 부분 코딩 */
		
					System.out.println();
				}
		
		
		
		
		//	}
		
		
		
		
		
		
		
		
		
	}

}
