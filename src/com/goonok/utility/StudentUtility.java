package com.goonok.utility;

import com.goonok.Student;

import java.util.List;
import java.util.Scanner;


public class StudentUtility
{

    //1. Add Student;
    public static Student addStudent(){

        Scanner input = new Scanner(System.in);
        Student s = new Student();
        System.out.print("Please enter student id: ");
        s.setStID(input.nextInt());
        System.out.print("Enter Student name: ");
        input.nextLine();
        s.setName(input.nextLine());
        System.out.print("Enter Student age: ");
        s.setAge(input.nextInt());

        return s;
    }

    //2. Update Student

    //3. Display Student
    public static void displayAllStudent(List<Student> studentList){
        for(Student student : studentList){
            System.out.println(student.toString());
        }
    }

    public static void updateStudent(List<Student> studentList) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        System.out.print("Enter Student Age: ");
        int age = input.nextInt();

        // we have just created it, if matched then replaced the st object to the list;
        Student st = new Student(id, name, age);

        for (Student student : studentList ){
            if (student.getStID() == id){
                int position = studentList.indexOf(student);
                //replaced with st object
                studentList.set(position, st);
                System.out.println("Student updated successfully!");
                break;
            }
        }
    }

    public static void deleteAllStudent(List<Student> studentList) {
        studentList.clear();

    }

    //4. Delete Student;
}
