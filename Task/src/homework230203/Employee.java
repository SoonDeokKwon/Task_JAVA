package homework230203;

public class Employee {
	//필드
	public String name;
	public int salary;

		
	//생성자
	public Employee () {
			
	}
	public Employee (String name, int salary) {
		this.name =  name;
		this.salary = salary;
	}
		
	//메소드
	public String getName() {
		return name;
	}
		public int getSalary() {
		return salary;
	}
		
	public void getInformation() {
		System.out.print("이름: " + name + "\t연봉: " + salary + "\t");
	}		 
	public void print() {
		System.out.println("수퍼클래스");
	}
}
