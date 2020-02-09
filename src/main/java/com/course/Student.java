package com.course;

public class Student {
    private static int nextId = 0;
    private final int id;
    private String firstName,lastName;

    public Student(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = nextId;
        nextId++;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void registerForCourse(Course course){
        course.registerStudent(this);
    }
    public void unregisterForCourse(Course course){
        course.unregisterStudent(this);
    }
}
