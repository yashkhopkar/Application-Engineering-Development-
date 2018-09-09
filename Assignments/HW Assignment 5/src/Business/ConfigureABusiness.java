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
public class ConfigureABusiness {
   
   //private PersonDirectory personList;
    public static Business initialize (String name)
    {
       Business business = new Business(name);
        PersonDirectory personList = business.getPersonlist();
        Person p = personList.addPerson();
        p.setFirstName("Yash");
        p.setLastName("Khopkar");
       
        
        Person p1  = personList.addPerson();
        p1.setFirstName("Jose");
        p1.setLastName("Mourinho");
        business.setPersonlist(personList);
        
        UserAccountDirectory userAccountList = business.getUserAccountList();
        UserAccount ua = userAccountList.addUserAccount();
        ua.setPerson(p);
        ua.setUsername("yashkhopkar");
        ua.setPassword("ysk1234");
        ua.setRole("System Admin");
        p.setUserAccount(ua);
        UserAccount ua1 = userAccountList.addUserAccount();
        ua1.setPerson(p1);
        ua1.setUsername("josem");
        ua1.setPassword("jm1234");
        ua1.setRole("Human Resources");
        p1.setUserAccount(ua1);
        business.setUserAccountList(userAccountList);
        return business;
        
        
  }
}
