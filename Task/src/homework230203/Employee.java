package homework230203;

public class Employee {
	//�ʵ�
		String name;
		int salary;
		public String getName() {
			return name;
		}
		public int getSalary() {
			return salary;
		}

		
		//������
		public Employee () {
			
		}
		public Employee (String name, int salary) {
			this.name =  name;
			this.salary = salary;
		}
		
		//�޼ҵ�
		 public void getInformation() {
			 System.out.println("�̸� : " + name + "���� : " + salary);
		 }
		 
		 public void print() {
			 System.out.println("����Ŭ����");
		 }
}
