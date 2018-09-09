/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Yash
 */
public class MasterSchedule {
    private ArrayList <FlightSchedule> mstSch;
    
    public MasterSchedule()
    {
    mstSch = new ArrayList<FlightSchedule>();
    }

    public ArrayList<FlightSchedule> getMstSch() {
        return mstSch;
    }

    public void setMstSch(ArrayList<FlightSchedule> mstSch) {
        this.mstSch = mstSch;
    }
    
    public FlightSchedule addFlightSchedule()
    {
    FlightSchedule f1 = new FlightSchedule();
    mstSch.add(f1);
    return f1;
    }
}
