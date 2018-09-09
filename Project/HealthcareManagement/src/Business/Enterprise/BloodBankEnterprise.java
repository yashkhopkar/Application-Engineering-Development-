/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.BloodBankAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author shubhisharma
 */
public class BloodBankEnterprise extends Enterprise{
    
      public BloodBankEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.BloodBank);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new BloodBankAdminRole());
        return roles;
    }
}
