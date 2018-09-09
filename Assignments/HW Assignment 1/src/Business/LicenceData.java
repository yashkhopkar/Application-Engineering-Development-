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
public class LicenceData {
    private String softwareName;
    private String licenceType;
    private String costOfLicence;
    private String lStartDate;
    private String lEndDate;
    

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public String getLicenceType() {
        return licenceType;
    }

    public void setLicenceType(String licenceType) {
        this.licenceType = licenceType;
    }

    public String getCostOfLicence() {
        return costOfLicence;
    }

    public void setCostOfLicence(String costOfLicence) {
        this.costOfLicence = costOfLicence;
    }

    public String getlStartDate() {
        return lStartDate;
    }

    public void setlStartDate(String lStartDate) {
        this.lStartDate = lStartDate;
    }

    public String getlEndDate() {
        return lEndDate;
    }

    public void setlEndDate(String lEndDate) {
        this.lEndDate = lEndDate;
    }
    
}
