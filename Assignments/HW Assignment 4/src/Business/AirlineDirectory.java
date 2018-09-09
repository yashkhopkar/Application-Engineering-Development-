/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Yash
 */
public class AirlineDirectory {
    private ArrayList<Airliner> airlinerList;
    
    public AirlineDirectory(){
    this.airlinerList = new ArrayList<>();
    }

    public ArrayList<Airliner> getAirlinerList() {
        return airlinerList;
    }

    public void setAirlinerList(ArrayList<Airliner> airlinerList) {
        this.airlinerList = airlinerList;
    }
    
    public Airliner addAirliner()
    {
    Airliner airliner = new Airliner();
    airlinerList.add(airliner);
    return airliner;
    }
    
    public void deleteAirliner(Airliner airliner)
    {
    airlinerList.remove(airliner);
    }
    
    public Airliner searchAirliner(String name)
    {
        for(Airliner airliner:airlinerList)
        {
            if(airliner.getName().equals(name))
                return airliner;
                
        }
        return null;
                
    }
}
