/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csc239.creditcardverification.p2;

import java.util.Random;

/**
 *
 * @author admin
 */
public class CreditAccount {
    
    private String accountNum;
    private double availableCredit;
    private double maxLimit;
    private String issuerSymbol;
    private int issuerCode;
    private boolean accountValid;
    
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
    
    public boolean getAccountValid() {
        return this.accountValid;
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
             
             //test this one
             default -> throw new IllegalArgumentException("Bad choice: only 3-7 issuer codes are available. ");
                 
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
             
             //test this one
             default -> throw new IllegalArgumentException("Bad choice: only 3-7 issuer codes are available. ");
                 
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
    
    public void setAccountValid(boolean acValid) {
        this.accountValid = acValid;
    }

//constructors
    
    public CreditAccount(String issuerSymbol){
        this.issuerSymbol = issuerSymbol;
        this.issuerCode = this.getIssuerCode(issuerSymbol);
        System.out.printf("Issuer Symbol = %s, IssuerCode = %d\n", this.issuerSymbol, this.issuerCode);
       // String s = getIssuerSymbol(this.issuerCode)
       // String s = Integer.parseInt(this.issuerCode);
        String partialAcNum = this.getIssuerCodeText(issuerCode);
        
        Random rand = new Random();
  
        
        for (int i=0; i<15; i++) {
        int randInt1 =(char) rand.nextInt(10);
        
        partialAcNum +=randInt1;
        }
        
        System.out.println("Chars: "+partialAcNum);
        
        this.accountNum = partialAcNum;
        System.out.println(this.accountNum);
        
        
        
        
        
       /* Random rnd = new Random();
        int number = rnd. nextInt(999999999);
​        System.out.println(number);*/
// this will convert any number sequence into 6 character.
        //return String. format("%06d", number);
        //loop generated individual characters between 0 to 9(generated, make into characr, concatin with string partacnum
        //charat string length i1 for individual character
        //
    };
    public CreditAccount(String recordText,int recordLength){
        //need to implement
    };
    public String assembleRecordText(){
        return null;
        //need to implement
    };
    
    
    
}
