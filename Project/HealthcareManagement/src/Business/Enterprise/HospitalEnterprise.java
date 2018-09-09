/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.ClinicAdminRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Yash
 */
public class HospitalEnterprise extends Enterprise{

    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.Hospital);
    }

    @Override
    public HashSet<Role> getSupportedRole() {
        roles.add(new ClinicAdminRole());
        return roles;
    }
    
    
    
}
