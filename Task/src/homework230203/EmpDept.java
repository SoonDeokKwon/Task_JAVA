package homework230203;

public class EmpDept extends Employee{
	//�ʵ�
	String departmentName;
	
	//������
	public EmpDept () {
		
	}
	public EmpDept (String name, int salary, String departmentName) {
		this.name = name;
		this.salary = salary;
		this.departmentName = departmentName;
	}
	
	//�޼ҵ�
	@Override
	public void getInformation() {
		System.out.println("�̸�:" + name + " ����:" + salary + " �μ�:" + departmentName);
	}
	@Override
	public void print() {
		System.out.print("����Ŭ����" + "\n" + "����Ŭ����");
	}
}
