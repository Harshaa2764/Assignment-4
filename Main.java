/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Assign and print the roll number ,phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class "Student".
package pkg03_java_assignment;

/**
 *
 * @author SHARDUL
 */
class Student1{

int roll_no;

long Phone_Number;

String Address; }

public class Main {

public static void main(String[] args) {

 Student student_object1 = new Student();

Student student_object2 = new Student();

student_object1.roll_no = 95;

student_object1.Phone_Number = 1234567L;

student_object1.Address = "xyz";

student_object2.Address = "idk";

student_object2.roll_no = 92;

student_object2.Phone_Number = 1234567L;

System.out.println(student_object2.roll_no + " " + student_object2.Phone_Number + " "+ student_object2.Address);

System.out.println(student_object1.roll_no +" " + student_object1.Phone_Number +" " + student_object1.Address); } } 


