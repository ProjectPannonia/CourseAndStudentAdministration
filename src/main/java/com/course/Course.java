package com.course;

import java.util.HashSet;

public class Course {
    private static HashSet<Student> students = new HashSet<>();
    private static int nextId = 0;
    private int id;
    private String courseName;

    public Course(String courseName){
        this.courseName = courseName;
        this.id = nextId;
        nextId++;
    }
    public void registerStudent(Student student){
        students.add(student);
    }
    public void unregisterStudent(Student student){
        students.remove(student);
    }
    public String getCourseName(){
        return this.courseName;
    }
}
