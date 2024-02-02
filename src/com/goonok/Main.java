package com.goonok;

import com.goonok.utility.StudentUtility;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        while (true){
            System.out.println("\t\tStudent Project Management System");
            System.out.println("====================================================================");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Display all Students");
            System.out.println("4. Delete all Students");
            System.out.print("Enter your option: ");

            int choice = input.nextInt();
            switch (choice){
                case 1:
                    Student student = StudentUtility.addStudent();
                    studentList.add(student);
                    System.out.println("Student Added Successfully!");
                    break;
                case 2:
                    StudentUtility.updateStudent(studentList);
                    break;
                case 3:
                    System.out.println("Student List: ");
                    StudentUtility.displayAllStudent(studentList);
                    break;
                case 4:
                    StudentUtility.deleteAllStudent(studentList);
                    System.out.println("All student data has been deleted!");
                case 5:
                    break;
                default:
                    System.out.println("Enter valid choice!");
                    break;
            }
        }
    }
}