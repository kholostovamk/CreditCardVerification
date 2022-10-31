/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package csc239.lab18recursion;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Lab18Recursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        int remainder;
        
        System.out.print("Enter two integers (or 'q' to exit): ");
        n1 = input.nextInt();
        n2 = input.nextInt();
        
        while(n2!=0){
            remainder = n1%n2;
            n1 = n2;
            n2 = remainder;
        }
        
        System.out.println(" GCD = " +n1);
        
}}
