package com.ksd.homework0206;

public class Question01 {
	public static void main(String[] args) {
		Culture movie = new Movie("추격자", 7,5,"영화");
		
		movie.setTotalScore(4);
		movie.setTotalScore(1);
		movie.setTotalScore(2);
		movie.setTotalScore(3);
		movie.setTotalScore(5);
		
		movie.getInformation();
		System.out.println("======================");
	}
}
