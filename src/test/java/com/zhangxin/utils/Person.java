package com.zhangxin.utils;

import java.util.Date;

public class Person {

	private Integer id;
	private String name;
	private Integer age;
	private double gz;
	private Date datee;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public double getGz() {
		return gz;
	}
	public void setGz(double d) {
		this.gz = d;
	}
	public Date getDatee() {
		return datee;
	}
	public void setDatee(Date datee) {
		this.datee = datee;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", gz=" + gz + ", datee=" + datee + "]";
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(Integer id, String name, Integer age, double gz, Date datee) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gz = gz;
		this.datee = datee;
	}
	
}
