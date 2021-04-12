/**
 * Dans le terrarium, il n'y a qu'un actionneur, la valve.
 * La valve peut être ouverte (1) ou fermée (0).
 */
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
