/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and have a method named “returnArea” which returns the area of the rectangle. Length and breadth of the rectangle are entered through the keyboard.
package pkg03_java_assignment;

/**
 *
 * @author SHARDUL
 */
import java.util.Scanner;

class area{
    int length;
    int breadth;
    area(int a, int b)
    {
         length = a;
         breadth = b;
    }
    public int areareturn()
    {
        return length * breadth;
    }
}

public class Rectangle4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the lenght of Recatangle");
         a = obj.nextInt();
        obj.nextLine();
        System.out.println("Enter the breadth of Recatangle");
        b = obj.nextInt();
        area ob1 = new area(a,b);
        System.out.println("Area = "+ ob1.areareturn());
    }
}
