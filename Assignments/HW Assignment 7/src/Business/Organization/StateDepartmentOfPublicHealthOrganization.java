/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SDPHAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Yash
 */
public class StateDepartmentOfPublicHealthOrganization extends Organization {

    public StateDepartmentOfPublicHealthOrganization() {
        super(Organization.Type.StateDepartmentOfPublicHealth.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SDPHAdminRole());
        return roles;
    }
    
}
