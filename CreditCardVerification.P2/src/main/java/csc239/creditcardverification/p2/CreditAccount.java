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
    
//setters
    
    
}
