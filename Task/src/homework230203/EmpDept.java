package homework230203;

public class EmpDept extends Employee{
	//필드
	String departmentName;
	
	//생성자
	public EmpDept () {
		
	}
	public EmpDept (String name, int salary, String departmentName) {
		this.name = name;
		this.salary = salary;
		this.departmentName = departmentName;
	}
	
	//메소드
	@Override
	public void getInformation() {
		System.out.println("이름:" + name + " 연봉:" + salary + " 부서:" + departmentName);
	}
	@Override
	public void print() {
		System.out.print("수퍼클래스" + "\n" + "서브클래스");
	}
}
