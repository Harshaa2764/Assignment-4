/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named 'Rectangle' with a method names 'Area' which return the area and length and breadth passed as parameters to its constructors.
package pkg03_java_assignment;

/**
 *
 * @author SHARDUL
 */
class Rectangle {
    int lenght;
    int breath;

    Rectangle(int l, int b) {
        this.lenght = l;
        this.breath = b;
    }

    public int area()
    {
        return lenght * breath;
    }
}
 public class Rectangle1{
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(4,5);
        Rectangle obj1 = new Rectangle(5,8);

        System.out.println(obj.area());
        System.out.println(obj1.area());





    }


}
