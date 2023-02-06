package homework230203;

public class StandardWeightInfo extends Human {
	//필드
	
	//생성자
	public StandardWeightInfo (String name, int height, int weight) {
		super(name, height, weight);
	}
	
	//메소드
	public double getStandardWeight() {
		double result = (double)(height-100)*0.9;
		return result;
	}

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.printf(", 표준체중 %.1f 입니다. \n", getStandardWeight());
	}
}
