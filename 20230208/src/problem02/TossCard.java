package problem02;

public class TossCard extends Card {
	//필드
	public String company = "Toss";
	public String cardStaff;
	
	//생성자

	public TossCard(String cardNo, int validDate, int CVC, String cardStaff) {
		super(cardNo, validDate, CVC);
		this.cardStaff = cardStaff;
		//this.company = "Toss";
	}

	//메소드
	@Override
	public void showCardInfo() {
		System.out.println("카드정보 - Card NO, " + cardNo);
		System.out.println("담당직원 - " + cardStaff + ", " + company);
	}
		
	

	
	
	
	
	
}
