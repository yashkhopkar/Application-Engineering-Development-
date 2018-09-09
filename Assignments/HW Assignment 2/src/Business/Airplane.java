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
public class Airplane {
    private int serialNo;
    private String modelNo;
    private String manufacturedBy;
    private String airlineName;
    private String airport;
    private String availabe;
    private String certificateExpired; 
    private int manifactureYear;
    private int numberOfSeats;

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getManufacturedBy() {
        return manufacturedBy;
    }

    public void setManufacturedBy(String manufacturedBy) {
        this.manufacturedBy = manufacturedBy;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getAvailabe() {
        return availabe;
    }

    public void setAvailabe(String availabe) {
        this.availabe = availabe;
    }

    public String getCertificateExpired() {
        return certificateExpired;
    }

    public void setCertificateExpired(String certificateExpired) {
        this.certificateExpired = certificateExpired;
    }

    public int getManifactureYear() {
        return manifactureYear;
    }

    public void setManifactureYear(int manifactureYear) {
        this.manifactureYear = manifactureYear;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    
    @Override
    public String toString()
    {
        return this.modelNo;
    }


    
        
    
    
}
