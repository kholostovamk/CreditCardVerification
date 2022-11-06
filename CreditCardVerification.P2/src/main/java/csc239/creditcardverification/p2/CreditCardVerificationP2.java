/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package csc239.creditcardverification.p2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/*
* CSC-239 Project 2:   Credit Card Verification Application
* Student: Margarita Kholostova
* Date: November 9
* Description: This program processes credit card transactions,
*               saving the results in a text file.
*/

public class CreditCardVerificationP2 {

    public static void main(String[] args) throws IOException {

        boolean keepRunning = true;
        String userInput;
  
        Scanner console = new Scanner(System.in);

        //intro for 1st session (maybe put in separate function later)
        printDescription();
       
        
        while (keepRunning == true) {

            System.out.println("Command: ");
            userInput = console.nextLine();
            String[] strArr = userInput.trim().split(" ");
            System.out.println("userInput= " + userInput);
            
            
            if (userInput.isEmpty()) {
                // ignore empty command
            } else if (strArr[0].equalsIgnoreCase("help")) {
                printDescription();
                
            } else if (strArr[0].equalsIgnoreCase("create")) {
                
                CreditAccount account1 = new CreditAccount(strArr[1]);
                
                writeData(account1);
               
                   
                
                
            } else if (strArr[0].equalsIgnoreCase("verify")) {

            } else if (strArr[0].equalsIgnoreCase("q")) {
                keepRunning = false; 
            }

        }
    }
    
    public static void printDescription() {
        System.out.println("This program accepts the following inputs and performs the corresponding actions:\n");
        System.out.println("USAGE:   command parameters(s)");
        System.out.printf("   %-10s %-10s\n", "COMMAND", "PARAMETER(S)");
        System.out.printf("   %-10s %-10s %-10s\n", "help", "\t\t", "Output help text.");
        System.out.printf("   %-10s %-10s %-10s\n", "create", "issuerSymbol", "\t CREATE new account.");
        System.out.printf("   %-10s %-10s %-10s\n", "verify", "accountNum amount", " VERIFY a purchase or credit.");
        System.out.printf("   %-10s %-10s %-10s\n", "q", "\t\t", "exit the program.\n");
        System.out.println("The command and issuerSymbol values are NOT case sensitive.");
        System.out.println("The following credit cards are supported:");
        System.out.printf("   %-20s %-10s\n", "CARD", "SYMBOL");
        System.out.printf("   %-20s %-10s\n", "American Express", "AE");
        System.out.printf("   %-20s %-10s\n", "Visa", "V");
        System.out.printf("   %-20s %-10s\n", "MasterCard", "MC");
        System.out.printf("   %-20s %-10s\n", "Discover", "DIS");
        System.out.printf("   %-20s %-10s\n", "Diners Club", "DINE");
    }
    
    public static void writeData(CreditAccount account1) throws IOException {
         BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
         writer.write(account1.getAccountNum() + " | " + account1.getAvailableCredit() + " | " + account1.getMaxLimit());
         writer.close();
    }
     
    
}      
