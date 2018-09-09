/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Role.SponsorAdmin;
import java.util.HashSet;

/**
 *
 * @author shubhisharma
 */
public class SponsorEnterprise extends Enterprise {
    
    public SponsorEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Sponsor);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new SponsorAdmin());
        return roles;
    }
}
