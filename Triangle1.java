/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Write a program to print the area and perimeter of a triangle of a triangle having sides of 3,4 and 5 units by creating a class named 'Triangle' with constructor having the three sides
package pkg03_java_assignment;

/**
 *
 * @author SHARDUL
 */
import java.util.Scanner;

public class Triangle1
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first side: ");
        double a = in.nextDouble();
        System.out.print("Enter second side: ");
        double b = in.nextDouble();
        System.out.print("Enter third side: ");
        double c = in.nextDouble();
        
        double perimeter = a + b + c;
        double s = perimeter / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}

