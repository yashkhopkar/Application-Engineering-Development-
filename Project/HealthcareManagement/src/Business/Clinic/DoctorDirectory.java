/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Clinic;

import Business.Clinic.Doctor;
import java.util.ArrayList;

/**
 *
 * @author shubhisharma
 */
public class DoctorDirectory {
    private ArrayList<Doctor> doctorList;

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }
    
     public DoctorDirectory(){
        doctorList= new ArrayList<>();
                
    }
     
    public Doctor addDoctor() {
        Doctor doctor = new Doctor();
        doctorList.add(doctor);
        return doctor;
    }
    
    //Removing an Employee from the Directory
    public void removeDoctor(Doctor doctor) {
        doctorList.remove(doctor);
    }

}
