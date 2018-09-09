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
public class UserAccountDirectory {
private ArrayList<UserAccount> userAccountList;

public UserAccountDirectory()
{
userAccountList = new ArrayList<>();
}

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }

public UserAccount addUserAccount()
    {
        UserAccount u  = new UserAccount();
        userAccountList.add(u);
        return u;
    }
    
    public void deleteUserAccount(UserAccount u)
    {
        userAccountList.remove(u);
    }
    
    public UserAccount isValidUser(String username,String password)
    {
        for(UserAccount userAccount:userAccountList)
        {
            if((userAccount.getUsername().equals(username))&&(userAccount.getPassword().equals(password))&&(userAccount.getRole().equalsIgnoreCase("System Admin")))
            return userAccount;    
        }
        return null;
    }
      public UserAccount isValidUser1(String username,String password)
    {
        for(UserAccount userAccount:userAccountList)
        {
            if((userAccount.getUsername().equals(username))&&(userAccount.getPassword().equals(password))&&(userAccount.getRole().equalsIgnoreCase("Human Resources")))
            return userAccount;    
        }
        return null;
}
      public UserAccount findUserAccount(String username)
      {
          for(UserAccount account:userAccountList)
          {
              if(account.getUsername().equals(username))
                  return account;
          }
          return null;
      }
    }
