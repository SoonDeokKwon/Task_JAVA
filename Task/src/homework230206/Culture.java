package homework230206;

public abstract class Culture {
	
	//필드
	//제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드
	public String title;
	public int director;
	public int audience;
	public int totalScore;
	
	//생성자
	public Culture () {
		
	}
	//제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화
	public Culture(String title, int director, int audience ) {
		this.title = title;
		this.director = director;
		this.audience  = audience;
	}
	
	//메소드
	//(1)public void setTotalScore(int score) : 관객수와 총점을 누적시키는 기능
	public void setTotalScore(int score) {
		totalScore += score;
		audience += 1;
	}
	
	//(2) public String getGrade() : 평점을 구하는 기능
	public String getGrade() {
		String scoreAvg = "";
		double results = (double)totalScore / audience;
//		if(results<=1) {
//			System.out.println("☆");
//		}else if(results<=2) {
//			System.out.println("☆☆");
//		}else if(results<=3) {
//			System.out.println("☆☆☆");
//		}else if(results<=4) {
//			System.out.println("☆☆☆☆");
//		}else if(results<=5) {
//			System.out.println("☆☆☆☆☆");
//		}
		return scoreAvg;
	}
	
	//(3) public abstract void getInformation() : 정보를 출력하는 추상메소드
	public abstract void getInformation();
	
	
}
