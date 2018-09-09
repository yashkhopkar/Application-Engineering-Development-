/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author satvika shetty
 */
public class EndUserEnterprise extends Enterprise{
  
    public EndUserEnterprise(String name) {
      super(name, EnterpriseType.EndUser);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
       throw new UnsupportedOperationException("Not supported yet."); 
    }
}
