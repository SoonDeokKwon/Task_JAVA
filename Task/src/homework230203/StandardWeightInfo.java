package homework230203;

public class StandardWeightInfo extends Human {
	//�ʵ�
	
	//������
	public StandardWeightInfo (String name, int height, int weight) {
		super(name, height, weight);
	}
	
	//�޼ҵ�
	public double getStandardWeight() {
		double result = (height-100)*0.9;
		return result;
	}

	@Override
	public void getInformation() {
		System.out.println(name + "���� ����" + height + ", ������" + weight + ", ǥ��ü�� " +getStandardWeight() + "�Դϴ�.");
	}
}
