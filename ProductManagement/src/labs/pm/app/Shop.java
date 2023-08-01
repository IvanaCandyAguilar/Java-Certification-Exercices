/*
 * (@code Shop) class represents an aplication that manage Product Management System
 * @version: 4.0
 * @author: oracle
 *
 */

package labs.pm.app;
import labs.pm.data.Product;

import java.math.BigDecimal;

public class Shop {

    public static void main(String[] args) {
       Product p1 = new Product();
        p1.setID(101);
        p1.setName("Tea");
        p1.setPrice(BigDecimal.valueOf(1.99));
        System.out.println(p1.getID()+" "+p1.getName()+" "+p1.getPrice()+" "+p1.getDiscount());
    }
}