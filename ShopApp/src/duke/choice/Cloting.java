package duke.choice;

public class Cloting{
    private String description;
    private double price;
    private String size="M";
    private final double MIN_PRICE=10;
    private final double MIN_TAX=.2;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + ( price * MIN_PRICE);
    }

    public void setPrice(double price) {

        this.price = (price>MIN_PRICE)? price:MIN_PRICE;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
