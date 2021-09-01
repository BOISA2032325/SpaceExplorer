public class Objet {

    enum Item{

        A("Clee a molette"),
        B("Bidon essence"),
        C("Armure");


        public String item;

        Item(String itemPossible){
            this.item = itemPossible;
        }

        public String getItem() {
             return item;
        }

    }

}
