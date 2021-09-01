import java.util.ArrayList;

public class Inventaire extends Objet {

    public ArrayList<Objet.Item> inventaireDeUtilisateur = new ArrayList<>();
    int x = 0;
    ArrayList<String>listFinal = new ArrayList<>();


    public void setAjouterItemAInventaire(int x){
        this.x = x;

        switch (x){
            case 1:
                inventaireDeUtilisateur.add(Item.A);
                break;
            case 2:
                inventaireDeUtilisateur.add(Item.B);
                break;
            case 3:
                inventaireDeUtilisateur.add(Item.C);
                break;
            default:
        }

    }


    public ArrayList<String>ajouterItemAInventaire() {

        for (Item item : inventaireDeUtilisateur) {
            listFinal.add(item.getItem());
        }

        return listFinal;

    }


    public String inventaireString(){

        String invCompString;

        invCompString = "Inventaire : " + ajouterItemAInventaire();

        return invCompString;
    }


}