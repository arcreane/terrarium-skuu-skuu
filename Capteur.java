/**
 * Capteur contient un Tableau de mesures
 */

import java.util.Arrays;

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

