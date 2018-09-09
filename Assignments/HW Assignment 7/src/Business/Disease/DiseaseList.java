/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Disease;

import java.util.ArrayList;

/**
 *
 * @author Yash
 */
public class DiseaseList {

private ArrayList<Disease> diseaseList;

   public DiseaseList()
   {
       diseaseList = new ArrayList<Disease>();
   }
   
   public Disease createDisease()
   {
       Disease disease = new Disease();
       diseaseList.add(disease);
       return disease;
   }


}
