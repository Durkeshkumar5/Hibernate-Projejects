package org.jsp.Demo;

public class Employee {
	private int id;
	private String name;
	private long phone;
	private String email;
	private String desigination;
	private double salary;
	private String pass;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getPhone() {
		return phone;
	}


	public void setPhone(long phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDesigination() {
		return desigination;
	}


	public void setDesigination(String desigination) {
		this.desigination = desigination;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", desigination="
				+ desigination + ", salary=" + salary + ", pass=" + pass + "]";
	}
	
}
