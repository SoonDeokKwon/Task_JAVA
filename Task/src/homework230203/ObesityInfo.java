package homework230203;

public class ObesityInfo extends StandardWeightInfo{
	//�ʵ�
	
	//������
	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);

	}

	//�޼ҵ�
	public double getObesity() {
		double result = (weight - super.getStandardWeight())/super.getStandardWeight()*100;
		return result;
	}

	@Override
	public void getInformation() {
		if(getObesity() >= 20) {
			System.out.println(name + "���� ����" + height + " ,������" + weight + ", ���Դϴ�.");			
		} else {
			System.out.println(name + "���� ����" + height + " ,������" + weight + ", �����Դϴ�.");
		}
	}
}
