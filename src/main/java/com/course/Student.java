package com.course;

import java.util.HashSet;

public class Student {
    private static int nextId = 0;
    private int id;
    private String studentFirstName,studentLastName;
    private HashSet<Course> courses = new HashSet();

    public Student(String firstName,String lastName,Course course){
        this.studentFirstName = firstName;
        this.studentLastName = lastName;
        courses.add(course);
        this.id = nextId;
        nextId++;
    }
    public void addCourse(Course course){
        courses.add(course);
        course.registerStudent(this);
    }
    public void removeCourse(String courseName){
        boolean contains = false;
        for (Course c : this.courses){
            if(c.getCourseName().equals(courseName)){
                this.courses.remove(c);
                contains = true;
            }
        }
        if(!contains) System.out.println("Ennek a felhasználónak nincs ilyen kurzusa.");
    }
    public void getAllRegisteredCourses(){
        if(this.courses.isEmpty()){
            System.out.println(this.studentFirstName + " " + this.studentLastName + " felhasználónak nincs felvett kurzusa!");
        }else {
            System.out.println(this.studentFirstName + " " + this.studentLastName + " felvett kurzusai:");
            for (Course c : courses) {
                System.out.println(c.getCourseName());
            }
        }
    }
}
