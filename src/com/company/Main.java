package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //instantiate an AddressBook object
        AddressBook addressBook = new AddressBook();

        // answer from the user
        String answer = "";

        Scanner keyboard = new Scanner(System.in);

        do {

            System.out.println("Press (T) to enter a new teacher record.");
            System.out.println("Press (S) to enter a new student record.");
            System.out.println("Press (Q) to quit.");
            answer = keyboard.next();
            keyboard.nextLine();

            //enter a teacher record
            if (answer.equalsIgnoreCase("t")) {
                Teacher teacher = new Teacher();
                System.out.print("Enter teacher's first name: ");
                teacher.setFirstName(keyboard.nextLine());
                System.out.print("Enter teacher's last name: ");
                teacher.setLastName(keyboard.nextLine());
                System.out.print("Enter teacher's address: ");
                teacher.setAddress(keyboard.nextLine());
                System.out.print("Enter teacher's phone number: ");
                teacher.setPhoneNumber(keyboard.nextLine());
                System.out.print("Enter teacher's email: ");
                teacher.setEmail(keyboard.nextLine());

                addressBook.add(teacher);

                do {

                    System.out.println("  Press (C) to enter a course for this teacher.");
                    System.out.println("  Press (S) to stop.");

                    answer = keyboard.next();
                    keyboard.nextLine();

                    if (answer.equalsIgnoreCase("c")) {

                        Course course = initializeCourse();

                        teacher.addCourse(course);


                    }
                } while (!answer.equalsIgnoreCase("S"));


            }
            //enter student record
            else if (answer.equalsIgnoreCase("s")) {
                Student student = new Student();
                System.out.print("Enter student's first name: ");
                student.setFirstName(keyboard.nextLine());
                System.out.print("Enter student's last name: ");
                student.setLastName(keyboard.nextLine());
                System.out.print("Enter student's address: ");
                student.setAddress(keyboard.nextLine());
                System.out.print("Enter student's phone number: ");
                student.setPhoneNumber(keyboard.nextLine());
                System.out.print("Enter student's email: ");
                student.setEmail(keyboard.nextLine());

                addressBook.add(student);

                do {

                    System.out.println("   Press (C) to enter a course for this studentt");
                    System.out.println("   Press (S) to quit.");
                    answer = keyboard.next();
                    keyboard.nextLine();

                    if (answer.equalsIgnoreCase("c")) {

                        Course course = initializeCourse();

                        student.addCourse(course);
                   }
                } while (!answer.equalsIgnoreCase("S"));

            }


        } while (!answer.equalsIgnoreCase("Q"));

        //Display person's lists
        do {

            System.out.println("Press (T) to display teachers list.");
            System.out.println("Press (S) to display students list");
            System.out.println("Type (TC) to display teacher list with their courses");
            System.out.println("Type (SC) to display students list with their courses");
            System.out.println("Press (Q) to quit.");
            answer = keyboard.next();
            keyboard.nextLine();

            if (answer.equalsIgnoreCase("t")) {

                // print the teacher's records stored in the address book list
                for (Person person : addressBook.getPersonsList()) {

                    if (person.getClass().getSimpleName().equals("Teacher")) {

                        System.out.println("-----------------------------------------------------");

                        System.out.println(person.toString());
                    }
                }

            } else if (answer.equalsIgnoreCase("s"))
                // print the student's records stored in the address book list
                for (Person person : addressBook.getPersonsList()) {

                    if (person.getClass().getSimpleName().equals("Student")) {

                        System.out.println("-----------------------------------------------------");

                        System.out.println(person.toString());
                    }
                }else if (answer.equalsIgnoreCase("tc"))
                // print the student's records stored in the address book list
                for (Person person : addressBook.getPersonsList()) {

                    if (person.getClass().getSimpleName().equals("Teacher")) {

                        System.out.println("-----------------------------------------------------");

                        System.out.println(person.toString());
                        System.out.println(((Teacher) person).displayCourses());

                    }
                }else if (answer.equalsIgnoreCase("sc"))
                // print the student's records stored in the address book list
                for (Person person : addressBook.getPersonsList()) {

                    if (person.getClass().getSimpleName().equals("Student")) {

                        System.out.println("-----------------------------------------------------");

                        System.out.println(person.toString());
                        System.out.println(((Student) person).displayCourses());

                    }
                }

        } while (!answer.equalsIgnoreCase("Q"));


        //Display one particular teacher or student courses
        do {

            System.out.println("Press (T) to display the courses that a particular student takes");
            System.out.println("Press (S) to display the courses that a particular teacher takes");
            System.out.println("Press (Q) to quit.");
            answer = keyboard.next();
            keyboard.nextLine();

            if (answer.equalsIgnoreCase("t")) {

                System.out.println("Enter teacher email address:");
                ArrayList<Person> teachers = addressBook.searchByEmail(keyboard.nextLine());
                if(teachers.isEmpty()){
                    System.out.println("No teacher found.");
                }
                else if (teachers.size() == 1){
                    String coursesStr = ((Teacher)teachers.get(0)).displayCourses();
                    System.out.println(coursesStr);
                }
                else {
                    System.out.println("There is more then one teacher");

                }
            }else if(answer.equalsIgnoreCase("s")) {

                System.out.println("Enter student email address:");
                ArrayList<Person> students = addressBook.searchByEmail(keyboard.nextLine());
                if(students.isEmpty()){
                    System.out.println("No student found.");
                }
                else if (students.size() == 1){
                    String coursesStr = ((Student)students.get(0)).displayCourses();
                    System.out.println(coursesStr);
                }
                else {
                    System.out.println("There is more then one student");

                }
            }

            }while (!answer.equalsIgnoreCase("Q"));

        }

    // get the course data from the user
    public static Course initializeCourse() {
        Scanner keyboard = new Scanner(System.in);

        Course course = new Course();

        System.out.print("Enter course ID: ");
        course.setCourseID(keyboard.nextLine());
        System.out.print("Enter course name: ");
        course.setName(keyboard.nextLine());
        System.out.print("Enter course description: ");
        course.setDescription(keyboard.nextLine());

        return course;

    }
}


