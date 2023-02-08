package problem02;

public class DGBCard extends Card {

	//필드
	public String company = "대구은행";
	public String cardStaff;
	
	//생성자
	public DGBCard(String cardNo, int validDate, int CVC, String cardStaff) {
		super(cardNo, validDate, CVC);
		this.cardStaff = cardStaff;
		//this.company = "대구은행";
	}

	
	//메소드
	@Override
	public void showCardInfo() {
		super.showCardInfo();
		System.out.println("담당직원 - " + cardStaff + ", " + company);
	}
	
	
	
	
	
	
}
