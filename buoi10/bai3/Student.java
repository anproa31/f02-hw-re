package buoi10.bai3;

import java.util.Scanner;

public class Student {
    private String fullName;
    private String address;
    private String email;
    private String phoneNumber;
    private String studentId;


    public Student() {
    }

    public Student(String fullName, String address, String email, String phoneNumber, String studentId) {
        this.fullName = fullName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.studentId = studentId;
    }


    public String getFullName() { return fullName; }
    public String getAddress() { return address; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getStudentId() { return studentId; }


    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setAddress(String address) { this.address = address; }
    public void setEmail(String email) { this.email = email; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setStudentId(String studentId) { this.studentId = studentId; }


    public void study() {
        System.out.println(fullName + " is attending class.");
    }

    public void doHomework() {
        System.out.println(fullName + " is doing homework.");
    }

    public void payTuition() {
        System.out.println(fullName + " has paid the tuition fee.");
    }

    public void takeExam() {
        System.out.println(fullName + " is taking an exam.");
    }

    public void printInfo() {
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Student ID: " + studentId);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();


        Student student = new Student(fullName, address, email, phoneNumber, studentId);


        student.study();
        student.doHomework();
        student.payTuition();
        student.takeExam();
        student.printInfo();

        scanner.close();
    }
}
