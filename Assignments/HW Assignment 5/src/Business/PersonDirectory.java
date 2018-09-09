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
public class PersonDirectory {
 private ArrayList<Person>personlist;
 
 public PersonDirectory()
 {
     personlist = new ArrayList<>();
 }

    public ArrayList<Person> getPersonlist() {
        return personlist;
    }

    public void setPersonlist(ArrayList<Person> personlist) {
        this.personlist = personlist;
    }
    public Person addPerson()
    {
        Person p  = new Person();
        personlist.add(p);
        return p;
    }
    
    public void deletePerson(Person p)
    {
        personlist.remove(p);
    }
    
    public Person findPerson(String lname)
    {
        for(Person p:personlist)
        {
        if(p.getLastName().equals(lname))
            return p;
        }
        return null;
    }
}
