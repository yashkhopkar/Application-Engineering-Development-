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
public class Seat {
private int seatNo;
private Customer fName;
private Customer lName;

    public Customer getfName() {
        return fName;
    }

    public void setfName(Customer fName) {
        this.fName = fName;
    }

    public Customer getlName() {
        return lName;
    }

    public void setlName(Customer lName) {
        this.lName = lName;
    }


    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    

}
