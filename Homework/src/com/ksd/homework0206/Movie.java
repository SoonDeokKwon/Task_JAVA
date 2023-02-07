package com.ksd.homework0206;

public class Movie extends Culture{

	String gerne;
	
	public Movie(String title, int director, int actor, String gerne) {
		super(title, director, actor);
		this.gerne = gerne;
	}

	@Override
	public void getInformation() {
		System.out.println(gerne + "제목 : " + title);
		System.out.println("감독 수 : " + director);
		System.out.println("베우 수 : " + actor);
		System.out.println("영화총점 :" + total);
		System.out.println("영화평점 :" + getGrade());
	}
	
	
	
	
}
