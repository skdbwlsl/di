package com.care.root;

public class STBean { //저장담당
	private String name;
	private int age;
	private Student st;
	
	public void namePrint(){
		st.namePrint(name);  //name출력해주는 코드로 연결
	}
	public void agePrint() {
		st.agePrint(age);   //age출력해주는 코드로 연결
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student getSt() {
		return st;
	}
	public void setSt(Student st) {
		this.st = st;
	}

}
