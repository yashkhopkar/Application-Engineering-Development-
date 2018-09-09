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
public class Fleet {
    private ArrayList <Airplane> fleetCatalog;
    
    public Fleet()
    {
    fleetCatalog = new ArrayList<Airplane>();
    }

    public ArrayList<Airplane> getFleetCatalog() {
        return fleetCatalog;
    }

    public void setFleetCatalog(ArrayList<Airplane> fleetCatalog) {
        this.fleetCatalog = fleetCatalog;
    }
    public Airplane addAirplane()
    {
    Airplane ap = new Airplane();
    fleetCatalog.add(ap);
    return ap;
    }
}
