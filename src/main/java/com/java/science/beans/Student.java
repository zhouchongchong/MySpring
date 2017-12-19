package com.java.science.beans;

/**
 * @Author: aiying014
 * Created by zcc on 15:32 2017/12/19.
 * @Description:
 */
public class Student implements Comparable {
	private String no;
	private String name;
	private Integer age;

	public Student(String no, String name, Integer age) {
		this.no = no;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student{" +
				"no='" + no + '\'' +
				", name='" + name + '\'' +
				", age=" + age +
				'}';
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		if (this.getAge() > ((Student)o).getAge()){
			return 1;
		}
		return 0;
	}
}
