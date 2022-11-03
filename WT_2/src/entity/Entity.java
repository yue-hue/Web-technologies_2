package entity;

public class Entity {
    protected String productName;
    protected String productID;
    protected double price;

    public Entity(String productName, String productID, double price) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName() {
        this.productName = productName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID() {
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

}
