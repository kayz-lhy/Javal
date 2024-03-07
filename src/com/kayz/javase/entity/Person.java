package com.kayz.javase.entity;

public class Person {
    static{
        System.err.println("Class Person has been initialized");
    }
    protected String name;
    protected String gender;
    protected short age;
    protected String job;

    protected Person(String name, String gender, short age, String job) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.job = job;
    }

    public void message(String message){
        System.out.println(this.name+" says: "+message);
    };


}
