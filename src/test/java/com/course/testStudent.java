package com.course;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testStudent {
    Student s1,s2,s3;
    Course history, mathematics,geography;
    
    @Before
    public void init(){
        history = new Course("Történelem");
        mathematics = new Course("Matematika");
        geography = new Course("Földrajz");

        s1 = new Student("József","Kovács",history);
        s1.addCourse(mathematics);

        s2 = new Student("Béla","Jónás",mathematics);
        s2.addCourse(geography);

        s3 = new Student("Jenő","Ferenc",geography);
    }
    @Test
    public void testRemoveCourseWithNonExistentCourse(){
        //test with non-existent course
        String expected = s1.getFullName() + " nincs " + geography.getCourseName() + " nevű kurzusa.";
        String result = s1.removeCourse("Földrajz");
        assertEquals(expected,result);
    }
    @Test
    public void testRemoveCourseWithExistentCourse(){
        String expected = "Törölve.";
        String result = s1.removeCourse("Történelem");
        assertEquals(expected,result);
    }
    @Test
    public void testRemoveCourseWithExistentCourseSecond(){
        String expected = "Törölve.";
        String result = s2.removeCourse("Földrajz");
        assertEquals(expected,result);
    }

    @After
    public void setToNull(){
        s1 = null;
        s2 = null;
        s3 = null;
        history = null;
        mathematics = null;
        geography = null;
    }
}
