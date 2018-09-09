/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CDC;

import Business.Supplier.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author pooji
 */
public class DiseaseDirectory {
    private ArrayList<Disease> diseaseList;
    
    public DiseaseDirectory(){
        diseaseList= new ArrayList<>();
    }

    public ArrayList<Disease> getDiseaseList() {
        return diseaseList;
    }

    public void setDiseaseList(ArrayList<Disease> diseaseList) {
        this.diseaseList = diseaseList;
    }
       public Disease addDisease() {
        Disease vaccine = new Disease();
        diseaseList.add(vaccine);
        return vaccine;
    }
    
    //Removing an Employee from the Directory
    public void removeDisease(Disease vaccine) {
        diseaseList.remove(vaccine);
    }
    
}
