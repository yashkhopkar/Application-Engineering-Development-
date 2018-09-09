/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

import java.util.ArrayList;

/**
 *
 * @author Yash
 */
public class VaccineCatalog {
    private ArrayList<Vaccine> vaccineCat;
    
    public VaccineCatalog()
    {
        vaccineCat = new ArrayList<Vaccine>();
    }
    
    public Vaccine createVaccine()
    {
        Vaccine vaccine = new Vaccine();
        vaccineCat.add(vaccine);
        return vaccine;
    }
}
