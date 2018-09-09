/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.NGOAdmin;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Yash
 */
public class NGOEnterprise extends Enterprise {

    public NGOEnterprise(String name) {
        super(name, EnterpriseType.NGO);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new NGOAdmin());
        return roles;
    }
    
}
