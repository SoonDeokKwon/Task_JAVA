package homework230203;

public class Human {
	//�ʵ�
	String name;
	int height;
	int weight;
	
	//������
	public Human () {
		
	}
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	
	//�޼ҵ�
	public void getInformation() {
		System.out.println("�̸�: " + name + " Ű: " + height + " ������: " + weight);
	}
}
