package homework230203;

public class StandardWeightInfo extends Human {
	//필드
	
	//생성자
	public StandardWeightInfo (String name, int height, int weight) {
		super(name, height, weight);
	}
	
	//메소드
	public double getStandardWeight() {
		double result = (height-100)*0.9;
		return result;
	}

	@Override
	public void getInformation() {
		System.out.println(name + "님의 신장" + height + ", 몸무게" + weight + ", 표준체중 " +getStandardWeight() + "입니다.");
	}
}
