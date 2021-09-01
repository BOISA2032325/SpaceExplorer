import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int choixPlanete;
        int choixDeUtilisateur;
        Vaisseau vaisseau1 = new Vaisseau();
        Inventaire inventaire1 = new Inventaire();
        Planete planeteAExplorer = new Planete();


        do {


            System.out.println("Bonjour voyageur.");
            System.out.println("Voici les choix disponible");
            System.out.println(" ");
            System.out.println("1. Explorer une planete");
            System.out.println("2. Examiner le vaisseau");
            System.out.println("3. Utiliser l'inventaire");
            System.out.println("4. Revenir en arrière");
            System.out.println("5. Quitter");

            choixDeUtilisateur = sc.nextInt();

            switch (choixDeUtilisateur){
                case 1:
                    System.out.println("Vous pouvez choisir entre 5 planete écrire le nombre souhaiter");
                    choixPlanete = sc.nextInt();
                    if (choixPlanete == 1){
                        System.out.println("Vous arriver sur la planèete 1 : " + planeteAExplorer.planete1());
                    }else if (choixPlanete == 2){
                        System.out.println("Vous arriver sur la planèete 2 : " + planeteAExplorer.planete2());
                    }else if (choixPlanete == 3){
                        System.out.println("Vous arriver sur la planèete 3 : " + planeteAExplorer.planete3());
                    }else if (choixPlanete == 4){
                        System.out.println("Vous arriver sur la planèete 4 : " + planeteAExplorer.planete4());
                    }else if (choixPlanete == 5){
                        System.out.println("Vous arriver sur la planèete 5 : " + planeteAExplorer.planete5());
                    }
                    break;
                case 2:
                    System.out.println(vaisseau1.toStringVaisseau());
                    break;
                case 3:
                    System.out.println(inventaire1.inventaireString());


            }

        }while(choixDeUtilisateur < 5);




    }
}
