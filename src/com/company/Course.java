package com.company;

public class Course {
    private String courseID;
    private String name;
    private String description;

    public Course() {
    }

    public Course(String courseID, String name, String description) {
        this.courseID = courseID;
        this.name = name;
        this.description = description;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String displayCourse(){
        String str = "";

        str = "Course ID:          "+ courseID +"\n"+
                "Course name:        " +name +"\n"+
                "Course description: " + description + "\n";
        return str;
    }
}
