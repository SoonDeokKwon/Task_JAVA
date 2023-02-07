package com.ksd.homework0206;

public abstract class Culture {
	String title;
	int director;
	int actor;
	int audience;
	int total;
	
	public Culture(String title, int director, int actor) {
		this.title = title;
		this.director = director;
		this.actor = actor;
	}
	
	public void setTotalScore(int score) {
		//관객 수 1씩 증가
		audience++;
		//점수를 누적(총점)
		total += score;
	}
	
	public String getGrade() {
		int avg = total / audience;
		String grade = "";
		//1번째
		switch(avg) {
		case 1:
			grade = "☆";
			break;
		case 2:
			grade = "☆☆";
			break;
		case 3:
			grade = "☆☆☆";
			break;
		case 4:
			grade = "☆☆☆☆";
			break;
		case 5:
			grade = "☆☆☆☆☆";
			break;
		}
		return grade;
	}
	
	public abstract void getInformation() ;
	
	
}
