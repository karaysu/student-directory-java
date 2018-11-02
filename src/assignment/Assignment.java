/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {

        int numbOfStudents = 0;
        Student[] students = new Student[1];
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n click 1 to create new student\n 2 to view the students\n 3 to Quit");
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Please input the number of students you would like to create: ");

                numbOfStudents = input.nextInt();
                students = new Student[numbOfStudents];

                for (int i = 0; i < students.length; i++) {

                    System.out.println("Full name:");
                    String name = input.next();
                    System.out.println("Student ID:");
                    String studentID = input.next();
                    System.out.println("Maths Marks:");
                    double maths = input.nextDouble();
                    System.out.println("English Marks:");
                    double english = input.nextDouble();
                    System.out.println("Web Marks:");
                    double web = input.nextDouble();
                    System.out.println("History Marks:");
                    double history = input.nextDouble();
                    System.out.println("Networking Marks:");
                    double networking = input.nextDouble();

                    try {
                        Student placeHolderStudent = new Student(name, studentID, history, maths, web, networking, english);
                        students[i] = placeHolderStudent;
                    } catch (IllegalArgumentException err) {
                        System.out.println(err.getMessage());

                    } 
                }

            }
            if (choice == 2) {
                if (students[0] != null) {
                    for (Student student : students) {
                        student.printStudent();

                    }
                } else {
                    System.out.println("No students to display");
                }
            }

            if (choice == 3) {
                break;
            }
        }
    }
}
