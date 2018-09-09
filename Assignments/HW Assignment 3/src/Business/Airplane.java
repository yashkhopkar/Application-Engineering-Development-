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
    
    private String flightNo;
    private String manufacturedBy;
    private String airport;
    private String certificateExpired; 
    private int manufactureYear;
    private int totalNumberOfSeats;
    private int availabeSeats;
    private String typeOfSeat;

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    

    

    public String getManufacturedBy() {
        return manufacturedBy;
    }

    public void setManufacturedBy(String manufacturedBy) {
        this.manufacturedBy = manufacturedBy;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getCertificateExpired() {
        return certificateExpired;
    }

    public void setCertificateExpired(String certificateExpired) {
        this.certificateExpired = certificateExpired;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getTotalNumberOfSeats() {
        return totalNumberOfSeats;
    }

    public void setTotalNumberOfSeats(int totalNumberOfSeats) {
        this.totalNumberOfSeats = totalNumberOfSeats;
    }

    public int getAvailabeSeats() {
        return availabeSeats;
    }

    public void setAvailabeSeats(int availabeSeats) {
        this.availabeSeats = availabeSeats;
    }

    public String getTypeOfSeat() {
        return typeOfSeat;
    }

    public void setTypeOfSeat(String typeOfSeat) {
        this.typeOfSeat = typeOfSeat;
    }
    
}
