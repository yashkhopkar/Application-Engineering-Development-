/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CDCAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Yash
 */
public class CDCOrganization extends Organization {

    public CDCOrganization() {
        super(Organization.Type.CDC.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CDCAdminRole());
        return roles;
    }
    
}
