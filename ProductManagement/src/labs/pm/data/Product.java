/*
 * (@code Shop) class represents properties behaviors of products objects in the Product Management System
 * <br>
 * Each product has an id, name and price
 * <br>
 * Each product can have a discount, calculated based on a
 * (@link DISCOUNT_RATE discount rate)
 * @version: 4.0
 * @author: oracle
 *
 */

package labs.pm.data;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author user
 **/
public class Product {
    private int ID;
    private String name;

    /*
    *A constant that defines a
    * {@link java.Math.BigDecimal} value of the discount rate
    * <br>
    * Discount rate is 10%
    * */
    public static final BigDecimal DISCOUNT_RATE =  BigDecimal.valueOf(0.1);

    public int getID() {
        return ID;
    }

    public void setID(final int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        //price = BigDecimal.ONE;
        this.price = price;
    }

    private BigDecimal price;

    public BigDecimal getDiscount(){
        return price.multiply(DISCOUNT_RATE).setScale(2, RoundingMode.HALF_UP);
    }
}
