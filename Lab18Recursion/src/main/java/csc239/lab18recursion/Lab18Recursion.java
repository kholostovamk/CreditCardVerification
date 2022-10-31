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
        String userInput = null;
        
        int m, n;
        int remainder;
        boolean isRunning = true;
        
        
        while (isRunning) {
        
        System.out.print("Enter two integers (or 'q' to exit): ");
        
        userInput = input.nextLine();
        
        if (userInput.equalsIgnoreCase("q")) {
            isRunning = false;
        }
        
        String[] strArr = userInput.trim().split(" ", 2);
         
        m = Integer.parseInt(strArr[0]);
        n = Integer.parseInt(strArr[1]);
        
        /* m = input.nextInt();
        n = input.nextInt();*/
            
        System.out.print("Entering 'gcd' method: m =" +m+", n = "+n);
        while(n!=0){
            remainder = m%n;
            m = n;
            n = remainder;
        }
        
        System.out.println(" GCD = " +m);
        
}}}
