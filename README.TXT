------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:

//Unused :
Classe Equipement : Methode afficheC()
Set listeClefs = capteurs.keySet();
        Iterator iterateur = listeClefs.iterator();
        while (iterateur.hasNext())
        {
            Object clef = iterateur.next();
            System.out.println (clef + " : " + capteurs.get(clef));
        }