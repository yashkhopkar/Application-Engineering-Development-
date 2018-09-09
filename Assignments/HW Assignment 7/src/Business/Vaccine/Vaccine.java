/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;
import Business.Disease.Disease;

/**
 *
 * @author Yash
 */
public class Vaccine {
    private String name;
    private Disease disease;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }
    
    
}
