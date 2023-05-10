package duke.choice;

public class ShopApp {
        public static void main(String[] args) {
            double tax = 0.2;
            double total=0.0;
            int measurement=3;

            System.out.println("Welcome to Duke Choice Shop!");

            Customer c1 = new Customer();
            Customer c2 = new Customer();
            c1.setName("Pinky");
            //c1.setSize("S");


            Cloting item1 = new Cloting();
            Cloting item2 = new Cloting();
            //Cloting item3 = new Cloting();

            Cloting[] items = {item1,item2, new Cloting(), new Cloting()};


            item1.setDescription("Blue Jacket");
            item1.setPrice(20.9);
            item1.setSize("M");

            item2.setDescription("Orange T-shirt");
            item2.setPrice(10.5);
            item2.setSize("S");

            items[2].setDescription("Green Scarf");
            items[2].setPrice(5.0);
            items[2].setSize("S");

            items[3].setDescription("Blue T-shirt");
            items[3].setPrice(10.5);
            items[3].setSize("S");

            measurement = 8;

            c1.setSize(measurement);

            c1.addItems(items);


            //System.out.println("Descripcion: " + item1.description + ", price: " + item1.price + " , size:" + item1.size);
            //System.out.println("Customer is "+ c2.name);
            //System.out.println("Descripcion: " + item2.description + ", price: " + item2.price + " , size:" + item2.size);
            //System.out.println("Descripcion: " + item3.description + ", price: " + item3.price + " , size:" + item3.size);

            //total =  (item1.price+item2.price*2) * (1 + tax);

            System.out.println("Customer is "+ c1.getName()+", size:"+c1.getSize()+", total:"+ c1.getTotalClotingCost());


            for(Cloting item: c1.getItems()){
                System.out.println("Items: "+ item.getDescription());
            }



           // System.out.println("Total: "+ total);
        }
}
