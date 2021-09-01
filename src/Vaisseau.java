import java.util.ArrayList;

public class Vaisseau extends Inventaire {

    private int vie = 100;
    private int quantitéDeCarburan = 1000;
    public int carburantApresVoyage = 0;
    public int vieApresAttack = 0;

    public int getQuantitéDeCarburan() {
        return quantitéDeCarburan;
    }

    public int getVie() {
        return vie;
    }

    public void setCarburantApresVoyage(int carburantApresVoyage) {
        this.carburantApresVoyage = carburantApresVoyage;
    }

    public void setVieApresAttack(int vieApresAttack) {
        this.vieApresAttack = vieApresAttack;
    }

    public int getCarburantApresVoyage() {
        return getQuantitéDeCarburan() - carburantApresVoyage;
    }

    public int getVieApresAttack() {
        return getVie() - vieApresAttack;
    }

    public String toStringVaisseau(){

        String etatVaisseau;
        etatVaisseau = "Point de vie : " + getVieApresAttack() + '\n' + "Quantite de carburant : " + getCarburantApresVoyage() +
        '\n' + inventaireString();
        return etatVaisseau;


    }

}
