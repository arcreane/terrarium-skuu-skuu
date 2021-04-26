package com.example.myapplicationforterrariom;

public class backend {
    import java.util.HashMap;
    import java.util.Map;
    import java.util.Iterator;
    import java.util.Set;
    public class terrarium
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
public class Capteur
{
    private String nom; //Clef HashMap capteurs
    private String[] Donnees_capteur;
    private int taille;

    public Capteur(String nom, String[] Donnees_capteur, int taille)
    {
        this.nom = nom;
        this.taille = taille;
        this.Donnees_capteur = new String[taille];
    }

    public String getID_capteur()
    {
        return nom;
    }

    public String[] getValue_capteur()
    {
        return Donnees_capteur;
    }
    public void setValue_of_Array(int position, String Donnee_serveur)
    {
        Donnees_capteur[position]=Donnee_serveur;
    }
    public String getValue_of_Array(int position)
    {
        return Donnees_capteur[position];
    }

    public void afficheD(String nom, String[] Donnees_capteur)
    {
        System.out.println("Donnees_capteur :");
        for (String Donnee_serveur : Donnees_capteur){
            System.out.println(nom + " = " + Donnee_serveur);
        }
        System.out.println(Arrays.toString(Donnees_capteur));
    }
}
public class Actionneur
{
    private String nom; //Clef HashMap actionneurs
    private boolean etat_actionneur;

    public Actionneur(String nom, boolean etat_actionneur)
    {
        this.nom = nom;
        this.etat_actionneur = etat_actionneur;
    }

    public String getID_actionneur()
    {
        return nom;
    }

    public void ChangeValue_actionneur(boolean etat_actionneur)
    {
        this.etat_actionneur = etat_actionneur;
    }
    public boolean getValue_actionneur()
    {
        return etat_actionneur;
    }

}
}
