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
public class CustomerDirectory {
 
    private ArrayList <Person> custDir;
    
     public CustomerDirectory()
    {
    custDir = new ArrayList<Person>();
    }

    public ArrayList<Person> getCustDir() {
        return custDir;
    }

    public void setCustDir(ArrayList<Person> custDir) {
        this.custDir = custDir;
    }
    
    public Person addPerson()
    {
    Person p = new Person();
    custDir.add(p);
    return p;
    }
}
