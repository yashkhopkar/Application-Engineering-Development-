/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author Yash
 */
public class ResearchLabOrganization extends Organization{

    public ResearchLabOrganization() {
        super(Type.ResearchLabAdmin.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        return null;
    }
    
}
