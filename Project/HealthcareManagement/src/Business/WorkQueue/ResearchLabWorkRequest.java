/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Yash
 */
public class ResearchLabWorkRequest extends WorkRequest{
    private boolean add;
    
    public ResearchLabWorkRequest()
    {
        add = false;
    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }
    
    
}
