package com.jobiak.mongo.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="student")
public class Student {
	@Id
	private Long id;
	private String name;
	private Double age;
	private int grade;
	
	public Student() {
		
	}

	public Student(Long id, String name, Double age, int grade) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAge() {
		return age;
	}

	public void setAge(Double age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}
	

}
