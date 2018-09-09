package Business;

import Business.Disease.Disease;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Vaccine.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author Yash
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private ArrayList<Disease> diseasesList;
    private ArrayList<Vaccine> vaccineList;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        diseasesList = new ArrayList<>();
        vaccineList = new ArrayList<>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    public ArrayList<Disease> getDiseasesList() {
        return diseasesList;
    }
     public Disease createDisease()
   {
       Disease disease = new Disease();
       diseasesList.add(disease);
       return disease;
   }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }

   public Vaccine createVaccine()
    {
        Vaccine vaccine = new Vaccine();
        vaccineList.add(vaccine);
        return vaccine;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

       

        return true;
    }
}