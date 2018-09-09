/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import java.util.ArrayList;

/**
 *
 * @author Yash
 */
public class SupplierDirectory {
    private ArrayList<Supplier> supplierDirectory;
    
    public SupplierDirectory()
    {
        supplierDirectory = new ArrayList<>();
    }

    public ArrayList<Supplier> getSupplierDirectory() {
        return supplierDirectory;
    }
    
    public Supplier createAndAddSupplier(String name)
    {
        Supplier supplier = new Supplier();
        supplier.setName(name);
        supplierDirectory.add(supplier);
        return supplier;
    }
}
