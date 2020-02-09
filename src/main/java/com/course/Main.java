package com.course;


public class Main
{
    public static void main( String[] args )
    {
        System.out.println("Welcome to the course administration program");
        System.out.println("--------------------------------------------");

        Course courseA = new Course("First course");
        Course courseB = new Course("Second course");

        System.out.println("CourseA id is: " + courseA.getId());
        System.out.println("CorseA name is: " + courseA.getName());
        System.out.println("CourseB id is:" + courseB.getId());
        System.out.println("CourseB name is: " + courseB.getName());

        Student firstStudent = new Student("Alice","The Student");
        Student secondStudent = new Student("Bob","McStudent");

        System.out.println("The first student id is: " + firstStudent.getId());
        System.out.println("The first student name is: " + firstStudent.getFirstName() + " " + firstStudent.getLastName());
        System.out.println("The second student id is: " + secondStudent.getId());
        System.out.println("The secont student name is: " + secondStudent.getLastName() + " " + secondStudent.getFirstName());

        firstStudent.registerForCourse(courseA);
        firstStudent.registerForCourse(courseB);
        courseA.registerStudent(secondStudent);

        System.out.println("CourseA, number of registered students: " + courseA.numberOfRegisteredStudent());
        System.out.println("CourseB, number of registered students: " + courseB.numberOfRegisteredStudent());


    }
}
