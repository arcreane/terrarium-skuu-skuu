/**
 * Une terrarium contient une Liste d’équipements (HashMap) 
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class terrarium 
{
    HashMap<String, Equipement> equipements;

    public terrarium()
     {
        equipements = new HashMap<String, Equipement>();      
     }
     
    public void ajouterEquipement(Equipement equipement)
     {
        equipements.put(equipement.getID_equipement(),equipement);
     }
    public HashMap<String, Equipement> get_equipements()
    {
        return equipements;
    }
    public Equipement get_E_ById(String id) 
    { 
        return equipements.get(id); //Retrouver un eq avec son iD
    }
    
    public void afficheE()
    {
        System.out.println("HashMap_equipements:");
        for (String mapKey : equipements.keySet()){
            System.out.println(mapKey + " : " +equipements.get(mapKey));
        }  
    }
  
}
