public class Planete extends Vaisseau {


   public void explorer(int carburantUtiliser){
       setCarburantApresVoyage(carburantUtiliser);
   }

   public String planete1(){
       double chanceAvoirItem;
       explorer(200);
       chanceAvoirItem = (Math.random() * 100);
       if (chanceAvoirItem < 20){
           double itemObtenu;
           itemObtenu = (1+Math.random()*3);
           setAjouterItemAInventaire((int)itemObtenu);
       }
       return toStringVaisseau();
   }

    public String planete2(){
        double chanceAvoirItem;
        explorer(300);
        chanceAvoirItem = (Math.random() * 100);
        if (chanceAvoirItem < 25){
            double itemObtenu;
            itemObtenu = (1+Math.random()*3);
            setAjouterItemAInventaire((int)itemObtenu);
        }
        return toStringVaisseau();
    }

    public String planete3(){
        double chanceAvoirItem;
        explorer(100);
        chanceAvoirItem = (Math.random() * 100);
        if (chanceAvoirItem < 10){
            double itemObtenu;
            itemObtenu = (1+Math.random()*3);
            setAjouterItemAInventaire((int)itemObtenu);
        }
        return toStringVaisseau();
    }

    public String planete4(){
        double chanceAvoirItem;
        explorer(400);
        chanceAvoirItem = (Math.random() * 100);
        if (chanceAvoirItem < 50){
            double itemObtenu;
            itemObtenu = (1+Math.random()*3);
            setAjouterItemAInventaire((int)itemObtenu);
        }
        return toStringVaisseau();
    }

    public String planete5(){
        double chanceAvoirItem;
        explorer(600);
        chanceAvoirItem = (Math.random() * 100);
        if (chanceAvoirItem < 60){
            double itemObtenu;
            itemObtenu = (1+Math.random()*3);
            setAjouterItemAInventaire((int)itemObtenu);
        }
        return toStringVaisseau();
    }


}
