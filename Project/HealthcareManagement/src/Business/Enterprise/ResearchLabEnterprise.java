/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.ResearchLabAdminRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Yash
 */
public class ResearchLabEnterprise extends Enterprise{


    

    public ResearchLabEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.ResearchLab);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new ResearchLabAdminRole());
        return roles;
    }

    
}
