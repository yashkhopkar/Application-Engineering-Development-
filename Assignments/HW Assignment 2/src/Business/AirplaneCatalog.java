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
public class AirplaneCatalog {
    private ArrayList <Airplane> airplaneCatalog;
    private String dateTime;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    public AirplaneCatalog()
    {
    airplaneCatalog = new ArrayList<Airplane>();
    }

    public ArrayList<Airplane> getAirplaneCatalog() {
        return airplaneCatalog;
    }

    public void setAirplaneCatalog(ArrayList<Airplane> airplaneCatalog) {
        this.airplaneCatalog = airplaneCatalog;
    }
    
    public Airplane addAirplane()
    {
    Airplane ap = new Airplane();
    airplaneCatalog.add(ap);
    return ap;
    }
    
    public Airplane addUserAirplane()
    {
    Airplane userap = new Airplane();
    airplaneCatalog.add(userap);
    return userap;
    }
    
    public void deleteAirplane(Airplane d)
    {
     airplaneCatalog.remove(d);
    }
    
    public Airplane updateAirplane()
    {
    Airplane updateAp = new Airplane();
    airplaneCatalog.add(updateAp);
    return updateAp;
    }
}
