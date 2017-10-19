package com.company;

import java.util.ArrayList;

public class Teacher extends Person{

    private ArrayList<Course> coursesTaught;

    public Teacher() {
        coursesTaught = new ArrayList<Course>();
    }

    public ArrayList<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(ArrayList<Course> coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public void addCourse(Course course){
        coursesTaught.add(course);
    }

    public String displayCourses(){

        StringBuffer strBuffer = new StringBuffer("Courses taught\n");

        for(Course course:coursesTaught)
        {
            strBuffer.append(course.displayCourse() + "\n");
        }

        return strBuffer.toString();
    }

}
