/*
 * (@code Shop) class represents an aplication that manage Product Management System
 * @version: 4.0
 * @author: oracle
 *
 */

package labs.pm.app;
import labs.pm.data.Product;
import labs.pm.data.Rating;

import java.math.BigDecimal;

public class Shop {

    public static void main(String[] args) {
       Product p1 = new Product(101,"Tea", BigDecimal.valueOf(1.99));
       Product p2 = new Product(101,"Coffe", BigDecimal.valueOf(2.98), Rating.FOUR_STAR);
       Product p3 = new Product(101,"Cake", BigDecimal.valueOf(3.98), Rating.FIVE_STAR);
       Product p4 = new Product();
       Product p5 = p3.applyRating(Rating.THREE_STAR);
        //p1.setID(101);
        //p1.setName("Tea");
        //p1.setPrice(BigDecimal.valueOf(1.99));
        System.out.println(p1.getID()+" "+p1.getName()
                +" "+p1.getPrice()+" "+p1.getDiscount()
                +""+p1.getRating().getStars());
        System.out.println(p2.getID()+" "+p2.getName()
                +" "+p2.getPrice()+" "+p2.getDiscount()
                +""+p2.getRating().getStars());
        System.out.println(p3.getID()+" "+p3.getName()
                +" "+p3.getPrice()+" "+p3.getDiscount()
                +""+p3.getRating().getStars());
        System.out.println(p4.getID()+" "+p4.getName()
                +" "+p4.getPrice()+" "+p4.getDiscount()
                +""+p4.getRating().getStars());
        System.out.println(p5.getID()+" "+p5.getName()
                +" "+p5.getPrice()+" "+p5.getDiscount()
                +""+p5.getRating().getStars());
    }
}