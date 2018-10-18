package com.av;

public class StudentVariables {
	private int idstudent;
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private String mobNo;
	private String password;

	public StudentVariables() {
		super();
	}

	public StudentVariables(int idstudent, String firstName, String lastName, String gender, String email, String mobNo, String password) {
		super();
		this.idstudent = idstudent;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.mobNo = mobNo;
		this.password = password;
	}

	public StudentVariables(String firstName, String lastName, String gender, String email, String mobNo, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.mobNo = mobNo;
		this.password = password;
	}

	public int getIdstudent() {
		return idstudent;
	}

	public void setIdstudent(int idstudent) {
		this.idstudent = idstudent;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
