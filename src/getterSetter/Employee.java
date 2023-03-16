package getterSetter;

public class Employee {
	private int empId;
	private String empName;
	private String empAddress;
	private long eMbNo;
	private double eSalary;
	public String id;
	public String name;
	public String add;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public long geteMbNo() {
		return eMbNo;
	}
	public void seteMbNo(long eMbNo) {
		this.eMbNo = eMbNo;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}

}
