/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Yash
 */
public class Person {
private String gender;
private String fName;
private String lName;
private String dob;
private String emailId;
private Address address;
private LicenceData lic;
private FinancialAccounts fin;
private FinancialAccounts safin;

    public FinancialAccounts getSafin() {
        return safin;
    }

    public void setSafin(FinancialAccounts safin) {
        this.safin = safin;
    }
private CreditCard creditCard;

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public LicenceData getLic() {
        return lic;
    }

    public void setLic(LicenceData lic) {
        this.lic = lic;
    }

    public FinancialAccounts getFin() {
        return fin;
    }

    public void setFin(FinancialAccounts fin) {
        this.fin = fin;
    }



    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
        
        
    }
     public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    
    

}
