
/**
 * Données réelles du terrarimu
 */
public class aplication
{
    public static void main(String[] args)
    {
        terrarium terrarium = new terrarium();
        
        //String devEUI, String application_name, int application_number)
        Equipement STREGA_Valve = new Equipement("0004a30b0025b1aa","STREGA_Valve",12); 
        Equipement onyield_temp = new Equipement("155734E6F398120","onyield_temp",11);
        terrarium.ajouterEquipement(STREGA_Valve);
        terrarium.ajouterEquipement(onyield_temp);
        
        //Données STREGA_Valve
        
        //String nom, boolean etat_actionneur
        //Valve/Couvercle
        Actionneur STREGA_valve = new Actionneur("STREGA_valve", false); 
        STREGA_Valve.ajouterActionneur(STREGA_valve);
        
        //String nom, String[] Donnees_capteur, int taille
        //Niveau des batteries
        STREGA_Valve.setBattery("3640");
        
        //Humidité de l'air 
        String[] humiditeValve = new String[1];
        humiditeValve[0] = "33.22906494140625";
        Capteur HumiditeValve = new Capteur("HumiditeValve", humiditeValve, 1);
        
        //Température Intérieure
        String[] tempValve = new String[1];
        tempValve[0] = "23.025588989257812";
        Capteur TempValve = new Capteur("TempValve", tempValve, 1);
        
        STREGA_Valve.ajouterCapteur(HumiditeValve);
        STREGA_Valve.ajouterCapteur(TempValve);
        
        //Données onyield_temp
        
        //Température 
        String[] temperature = new String[4];
        temperature[0] = "23";
        temperature[1] = "23";
        temperature[2] = "24";
        temperature[3] = "23";
        Capteur Temperature = new Capteur("Temperature", temperature, 4);
        
        
        
        onyield_temp.ajouterCapteur(Temperature);
        
        
        aplication jardin = new aplication();
        aplication.etat_terrarium(terrarium, STREGA_Valve, STREGA_valve, HumiditeValve);
        aplication.etat_terrarium(terrarium, STREGA_Valve, STREGA_valve, TempValve);
        aplication.etat_terrarium(terrarium, onyield_temp, null, Temperature);
    }
    
    public static void etat_terrarium(terrarium terrarium, Equipement equipement, Actionneur actionneur, Capteur capteur)
    {
        terrarium.afficheE();//terratium(HashMap_equipements)
        
        System.out.println("batteryValve : " +equipement.getBattery());
        
        equipement.afficheA(); //actionneur(equipement) 
        
        equipement.afficheC();
        
        System.out.println("etat_actionneur : " +actionneur.getValue_actionneur());
        
        capteur.afficheD(capteur.getID_capteur(), capteur.getValue_capteur());
    }
}
