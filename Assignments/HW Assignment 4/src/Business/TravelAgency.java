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
public class TravelAgency {
    private AirlineDirectory aircat;

    public AirlineDirectory getAircat() {
        return aircat;
    }

    public void setAircat(AirlineDirectory aircat) {
        this.aircat = aircat;
    }
    
    
    public TravelAgency()
    {
    this.aircat = new AirlineDirectory();
    }
}
