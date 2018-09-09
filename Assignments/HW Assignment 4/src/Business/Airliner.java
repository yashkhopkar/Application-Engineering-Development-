/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Yash
 */
public class Airliner {

    private String  name;
    private ArrayList<Flight> flightList;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        flightList = new ArrayList<>();
    }
    
    
    public Airliner()
    {
    this.flightList = new ArrayList<>();
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
    public Flight addFlight()
    {
    Flight flight = new Flight();
    flightList.add(flight);
    return flight;
    }
    public void deleteFlight(Flight flight)
    {
    flightList.remove(flight);
    }
    
        public Flight searchFlight(String flightNo)
    {
        for(Flight flight:flightList)
        {
            if(flight.getFlightNo().equals(flightNo))
                return flight;
        }
        
        return null;
    }
    @Override
        public String toString()
        {
            return name;
        }
}
