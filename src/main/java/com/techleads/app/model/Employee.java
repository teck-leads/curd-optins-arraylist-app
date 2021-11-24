package com.techleads.app.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Employee {
	
	private Integer id;
	private String name;
	private String location;
	private String skillSet;
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd@HH:mm:ss.SSSZ")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private LocalDate dateOfJoin;
	
	
	
	public Employee(Integer id, String name, String location, String skillSet, LocalDate dateOfJoin) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.skillSet = skillSet;
		this.dateOfJoin = dateOfJoin;
	}
	
	public Employee() {
		super();
	}

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
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(LocalDate dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", location=" + location + ", skillSet=" + skillSet
				+ ", dateOfJoin=" + dateOfJoin + "]";
	}
	
	

}
