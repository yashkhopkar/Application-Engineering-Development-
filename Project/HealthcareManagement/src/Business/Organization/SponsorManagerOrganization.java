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
 * @author shubhisharma
 */
public class SponsorManagerOrganization extends Organization{
     public SponsorManagerOrganization() {
        super(Organization.Type.SponsorManager.getValue());
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        return null;
    }
}
