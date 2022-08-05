/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Print the average of three numbers entered by user by creating a class named 'Average' having a method to calculate and print the average.
package pkg03_java_assignment;

/**
 *
 * @author SHARDUL
 */
import java.util.Scanner;
public class Average {

 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The average value is " + average(x, y, z)+"\n" );
    }

  public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
}
