package pkg05_objStream;

import java.io.Serializable;

public class Employee implements Serializable{
	private static final long serialVersionUID = 5028724420454247766L;
	private int empNo;
	private String empName;
	
	public Employee() {}
	public Employee(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "empNo = " + empNo + ", empName = " + empName;
	}
	

}
