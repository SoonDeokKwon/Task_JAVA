package homework230203;

public class ObesityInfo extends StandardWeightInfo{
	//필드
	
	//생성자
	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);

	}

	//메소드
	public double getObesity() {
		double result = (weight - super.getStandardWeight())/super.getStandardWeight()*100;
		return result;
	}

	@Override
	public void getInformation() {
		if(getObesity() >= 20) {
			System.out.println(name + "님의 신장" + height + " ,몸무게" + weight + ", 비만입니다.");			
		} else {
			System.out.println(name + "님의 신장" + height + " ,몸무게" + weight + ", 정상입니다.");
		}
	}
}
