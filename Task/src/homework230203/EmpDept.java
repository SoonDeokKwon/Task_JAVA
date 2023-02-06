package homework230203;

public class EmpDept extends Employee{
	//필드
	public String departmentName;
	
	//생성자
	public EmpDept () {
		
	}
	public EmpDept (String name, int salary, String departmentName) {
		//부모 객체 생성할 때 부서 이름 초기화
		super(name, salary);
		//자식 객체 생성할 때 부서 이름 초기화
		this.departmentName = departmentName;
	}
	
	//메소드
	public String getDepartmentName() {
		return departmentName;
	}
	
	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println("부서: " + departmentName);
	}
	@Override
	public void print() {
		super.print();
		System.out.print("서브클래스");
	}
}
