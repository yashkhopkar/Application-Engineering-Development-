/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author shubhisharma
 */
public class BloodPurchaseWorkRequest extends WorkRequest {
    
     private int noOfPackets;
    private String bloodGroup;
    private String venue;
    private boolean add;
    private String requestedDate;
    private String requestedTime;

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    
    
    public BloodPurchaseWorkRequest(){
        add = false;
    }

    public int getNoOfPackets() {
        return noOfPackets;
    }

    public void setNoOfPackets(int noOfPackets) {
        this.noOfPackets = noOfPackets;
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
