/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;
import Business.Supplier.SupplierDirectory;
import Business.Supplier.Supplier;
/**
 *
 * @author Yash
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    private ArrayList<Supplier> supplierDirectory;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public ArrayList<Supplier> getSupplierDirectory() {
        return supplierDirectory;
    }
    
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        
        if (type == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.CDC)
        {
            enterprise = new CDCEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Supplier)
        {
            enterprise = new SupplierEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else
        {
            enterprise = new SupplierEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
}
