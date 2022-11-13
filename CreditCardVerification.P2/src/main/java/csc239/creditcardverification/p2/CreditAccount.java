/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csc239.creditcardverification.p2;

import java.util.Random;

/*
* CSC-239 Project 2:   Credit Card Verification Application
* Student: Margarita Kholostova
* Date: November 9
* Description: This program processes credit card transactions,
*               saving the results in a text file.
*/

public class CreditAccount {
    
    private String accountNum;
    private double availableCredit;
    private double maxLimit;
    private String issuerSymbol;
    private int issuerCode;

 //Credit Card issuer symbols   
    public static final String ISSUER_AMER_EXPRESS = "AE";
    public static final String ISSUER_VISA = "V";
    public static final String ISSUER_MASTER_CARD = "MC";
    public static final String ISSUER_DISCOVER = "DIS";
    public static final String ISSUER_DINERS_CLUB = "DINE";

//Credit Card issuer Codes – first digit of account number (constants)
    public static final int ISSUER_CODE_AE = 3;
    public static final int ISSUER_CODE_V = 4;
    public static final int ISSUER_CODE_MC = 5;
    public static final int ISSUER_CODE_DIS = 6;
    public static final int ISSUER_CODE_DINE = 7;
    
//getters 
    public String getAccountNum(){
        return this.accountNum;
    }
    
    public double getAvailableCredit() {
        return this.availableCredit;
    }
    
    public double getMaxLimit() {
        return this.maxLimit;
    }
    
    public String getIssuerSymbol() {
        return this.issuerSymbol;
    }
    

     public static int getIssuerCode(String issuerSymbol){ 
        
        if (issuerSymbol.equalsIgnoreCase(ISSUER_AMER_EXPRESS))
            return ISSUER_CODE_AE;
        if (issuerSymbol.equalsIgnoreCase(ISSUER_VISA))
            return ISSUER_CODE_V;
        if (issuerSymbol.equalsIgnoreCase(ISSUER_MASTER_CARD))
            return ISSUER_CODE_MC;
        if (issuerSymbol.equalsIgnoreCase(ISSUER_DISCOVER))
            return ISSUER_CODE_DIS;
        if (issuerSymbol.equalsIgnoreCase(ISSUER_DINERS_CLUB))
            return ISSUER_CODE_DINE;
        //if none are "good" return 0
        return 0;
    };
    
    
    public static String getIssuerSymbol(int issuerCode){
       String issuerSymbol = null;
         switch(issuerCode){
             case 3 -> issuerSymbol = ISSUER_AMER_EXPRESS;
             case 4 -> issuerSymbol = ISSUER_VISA;
             case 5 -> issuerSymbol = ISSUER_MASTER_CARD;
             case 6 -> issuerSymbol = ISSUER_DISCOVER;
             case 7 -> issuerSymbol = ISSUER_DINERS_CLUB;
             
        
             default -> throw new IllegalArgumentException("Bad choice: only certain issuer codes are available. Look them up at the start of the program:\\) ");
                 
         }
         return issuerSymbol;
        }
    
    
    public static String getIssuerCodeText(int issuerCode){
       String issuerSymbol = null;
         switch(issuerCode){
             case 3 -> issuerSymbol = "3";
             case 4 -> issuerSymbol = "4";
             case 5 -> issuerSymbol = "5";
             case 6 -> issuerSymbol = "6";
             case 7 -> issuerSymbol = "7";
             
            
             default -> throw new IllegalArgumentException("Only 3-7 issuer codes are available. ");
                 
         }
         return issuerSymbol;
        }
    
    
//setters
    public void setAccountNum(String accountNum){
        this.accountNum  = accountNum;
    }
    
    public void setAvailableCredit(double availCredit){
        this.availableCredit = availCredit;
    }
    
    public void setMaxLimit(double maxLimit){
        this.maxLimit = maxLimit;
    }
    
    public void setIssuerSymbol(String issuerSym) {
        this.issuerSymbol = issuerSym;
    }
    

//constructors
    
    public CreditAccount(String issuerSymbol){
        this.issuerSymbol = issuerSymbol;
        this.issuerCode = CreditAccount.getIssuerCode(issuerSymbol);
    
        String partialAcNum = CreditAccount.getIssuerCodeText(issuerCode);
        
        Random rand = new Random();
        
        int lastDig = 0;
        
        //loop to create account number
        for (int i=0; i<15; i++) {
        int randInt1 =(char) rand.nextInt(10);
        partialAcNum +=randInt1;
        
        //remember last digit for max limit
        if (i==14){
            lastDig = randInt1;}
        }//end of for loop
        
        this.accountNum = partialAcNum;
        
        if (lastDig >= 0 || lastDig <=4){
            this.maxLimit = 1000.00;
            this.availableCredit= 1000.00;
        } 
        if (lastDig > 4) {
            this.maxLimit = 500.00;
            this.availableCredit= 500.00;
        }
        
        System.out.printf("New account created for credit card symbol %s: account number= %s, credit limit = $%.2f\n", this.issuerSymbol.toUpperCase(),this.accountNum, this.maxLimit);
    
    };
    
    public CreditAccount(String accountNum, String availCredit, String maxLimit){
        
        Double avail = Double.parseDouble(availCredit);
        Double max = Double.parseDouble(maxLimit);
        
        this.accountNum = accountNum;
        this.availableCredit = avail;
        this.maxLimit = max;
    };
   
}
