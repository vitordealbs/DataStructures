package LittleReview;

public class StructuredType {
    private String name;
    private double price;
    private int quantity;


    public StructuredType(String name, float price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return getName() + " " + getPrice() + " " + getQuantity();
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !"".equals(name)) {
            this.name = name;
        }

    }
}


