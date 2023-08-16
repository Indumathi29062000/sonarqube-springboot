package com.demo.studentdetails;

public class StudentDetailsModel {
	private String name;
    private int age;
    private String gender;
    

    public StudentDetailsModel(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.age=age;  //to get code or code smell
        }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

}
