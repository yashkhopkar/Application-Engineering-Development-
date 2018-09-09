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
public class Business {
private String name;
private PersonDirectory personlist;
private UserAccountDirectory userAccountList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonDirectory getPersonlist() {
        return personlist;
    }

    public void setPersonlist(PersonDirectory personlist) {
        this.personlist = personlist;
    }

    public UserAccountDirectory getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(UserAccountDirectory userAccountList) {
        this.userAccountList = userAccountList;
    }


public Business(String name)
{
    this.name = name;
    personlist = new PersonDirectory();
    userAccountList =new UserAccountDirectory();
}
}
