package com.course;

import java.util.HashSet;

public class Course {
    private static int nextId = 0;
    private final int id;
    private final String name;
    private final HashSet<Student> registeredStudents = new HashSet<Student>();

    public Course(String name){
        this.name = name;
        this.id = nextId;
        nextId++;
    }
    public String getName(){
        return this.name;
    }
    public int getId() {
        return id;
    }
    //Add student to the list
    public void registerStudent(Student student){
        registeredStudents.add(student);
    }
    //Remove student from the list
    public void unregisterStudent(Student student){
        registeredStudents.remove(student);
    }
    //To get the number of registered students
    public int numberOfRegisteredStudent(){
        return registeredStudents.size();
    }
}
