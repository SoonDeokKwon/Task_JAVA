package homework230203;

public class Employee {
	//필드
		String name;
		int salary;
		public String getName() {
			return name;
		}
		public int getSalary() {
			return salary;
		}

		
		//생성자
		public Employee () {
			
		}
		public Employee (String name, int salary) {
			this.name =  name;
			this.salary = salary;
		}
		
		//메소드
		 public void getInformation() {
			 System.out.println("이름 : " + name + "연봉 : " + salary);
		 }
		 
		 public void print() {
			 System.out.println("수퍼클래스");
		 }
}
