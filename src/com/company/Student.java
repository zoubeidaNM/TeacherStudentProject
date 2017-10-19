package com.company;

import java.util.ArrayList;

public class Student extends Person{

    private ArrayList<Course> coursesTaken;

    public Student() {
        coursesTaken = new ArrayList<Course>();
    }

    public ArrayList<Course> getCoursesTaken() {
        return coursesTaken;
    }


    public void setCoursesTaken(ArrayList<Course> coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public void addCourse(Course course){
        coursesTaken.add(course);
    }


    public String displayCourses(){

        StringBuffer strBuffer = new StringBuffer("Courses taken:\n");

        for(Course course:coursesTaken)
        {
            strBuffer.append(course.displayCourse() + "\n");
        }

        return strBuffer.toString();
   }
}
