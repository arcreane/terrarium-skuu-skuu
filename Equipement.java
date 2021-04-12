/**
 * Equipement (Hashmap) contient une Liste de capteurs et d'actionneurs (HashMap) 
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class Equipement
{
    HashMap<String, Actionneur> actionneurs;
    HashMap<String, Capteur> capteurs;
    private String devEUI; //Clef HashMap equipements
    private String application_name;
    private int application_number;
    private String batterie;
    
    public Equipement(String devEUI, String application_name, int application_number)
    {    
     this.devEUI = devEUI;
     this.application_name = application_name;
     this.application_number = application_number;
     
     actionneurs = new HashMap<String, Actionneur>();
     capteurs = new HashMap<String, Capteur>();
    }
    
    public void ajouterActionneur(Actionneur actionneur)
     {
       actionneurs.put(actionneur.getID_actionneur(),actionneur);
     }
    public HashMap<String, Actionneur> get_actionneurs()
    {
        return actionneurs;
    }
    public Actionneur get_A_ById(String id) 
    { 
        return actionneurs.get(id); //Retrouver un act avec son iD
    }
    
    public void ajouterCapteur(Capteur capteur)
    {
      capteurs.put(capteur.getID_capteur(),capteur);
    }
    public HashMap<String, Capteur> get_capteurs()
    {
        return capteurs;
    }
    public Capteur get_C_ById(String id) 
    { 
        return capteurs.get(id); //Retrouver un cap avec son iD
    }
    
    public String getID_equipement()
    {
        return devEUI;
    }
    public String getName_equipement()
    {
        return application_name;
    }
    public int getNumber_equipement()
    {
        return application_number;
    }
    
    public void setBattery(String batterie)
    {
        this.batterie = batterie;
    }
    public String getBattery()
    {
        return batterie;
    }
    
    public void afficheA()
    {
        System.out.println("HashMap_actionneurs:");
        for (String mapKey : actionneurs.keySet()){
            System.out.println(mapKey + " : " +actionneurs.get(mapKey));
        }  
    }
  
    public void afficheC()
    {
        System.out.println("HashMap_capteurs:");
        for (String mapKey : capteurs.keySet()){
            System.out.println(mapKey + " : " +capteurs.get(mapKey));
        }  
    }
    
}
