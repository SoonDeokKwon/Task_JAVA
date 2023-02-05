package homework230203;

public class Application02 {
	public static void main(String[] args) {
		
		StandardWeightInfo hong = new StandardWeightInfo("홍길동", 165, 45);
		hong.getInformation();
		
		ObesityInfo park = new ObesityInfo("박돌이", 168, 90);
		park.getInformation();

		
	}
}
