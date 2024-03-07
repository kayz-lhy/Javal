package com.kayz.javase.entity;

public class Student extends Person implements Study{
    private static final String job = "Student";

    private String major;


    public Student(String name, String gender, int age, String major) {
        super(name, gender, (short)age, job);
        this.major = major;
    }

    private void setMajor(String major){
        this.major=major;
    }

    @Override
    public void study(Course course){
        System.out.println(super.name+" learns "+course);
    }

}
