/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.Clinic.Doctor;
import java.util.Date;

/**
 *
 * @author shubhisharma
 */
public class NGOWorkRequest extends WorkRequest{
    private int noOfDocRequired;
    private String venue;
    private boolean add;
    private String requestedDate;
    private String requestedTime;
    
    

    public int getNoOfDocRequired() {
        return noOfDocRequired;
    }

    public void setNoOfDocRequired(int noOfDocRequired) {
        this.noOfDocRequired = noOfDocRequired;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }
    
    public NGOWorkRequest(){
        add = false;
    }

    public String getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(String requestedDate) {
        this.requestedDate = requestedDate;
    }

    public String getRequestedTime() {
        return requestedTime;
    }

    public void setRequestedTime(String requestedTime) {
        this.requestedTime = requestedTime;
    }

   
    
    
    
    
}
