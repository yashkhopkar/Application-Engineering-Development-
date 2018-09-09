/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Blood;

import Business.CDC.Disease;
import java.util.ArrayList;

/**
 *
 * @author shubhisharma
 */
public class BloodDirectory {
     private ArrayList<Blood> bloodList;
     
     public BloodDirectory(){
        bloodList= new ArrayList<>();
    }

    public ArrayList<Blood> getBloodList() {
        return bloodList;
    }

    public void setBloodList(ArrayList<Blood> bloodList) {
        this.bloodList = bloodList;
    }
     
        public Blood addBlood() {
        Blood blood = new Blood();
        bloodList.add(blood);
        return blood;
    }
    
    //Removing an Employee from the Directory
    public void removeBlood(Blood blood) {
        bloodList.remove(blood);
    }
}
