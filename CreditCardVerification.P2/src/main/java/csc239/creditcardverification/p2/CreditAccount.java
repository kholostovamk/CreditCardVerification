/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csc239.creditcardverification.p2;

/**
 *
 * @author admin
 */
public class CreditAccount {
    
    private String accountNum;
    private double availableCredit;
    private double maxLimit;
    private String issuerSymbol;
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
        //need to implement
        return 0;
    };
    
    
    public static String getIssuerSymbol(int issuerCode){
       String issuerSymbol = null;
        //need to implement
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
    };
    public CreditAccount(String recordText,int recordLength){
        //need to implement
    };
    public String assembleRecordText(){
        return null;
        //need to implement
    };
    
}
