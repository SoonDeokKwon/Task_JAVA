package problem02;

public class Card {
	//필드
	public String cardNo;
	public int validDate;
	public int CVC;
	
	
	//생성자
	public Card(String cardNo, int validDate, int CVC) {
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.CVC = CVC;
	}


	//메소드
	public String getCardNo() {
		return cardNo;
	}


	public int getValidDate() {
		return validDate;
	}


	public int getCVC() {
		return CVC;
	}
	
	
	public void showCardInfo() {
		System.out.println("카드정보 (Card NO : " + cardNo + ", 유효기간 : " + validDate + ", CVC : " + CVC + ")");
	}
	
	
	
}
