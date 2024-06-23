package EmployeeProject;

public class Employee {
	
	String name;
	int empid,exp,salary;
	public Employee(String name, int empid, int exp, int salary) {
		super();
		this.name = name;
		this.empid = empid;
		this.exp = exp;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
