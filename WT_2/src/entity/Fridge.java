package entity;

public class Fridge extends Entity {
    private String noFrost;
    private String fridgeVolume;
    private String height;
    private String color;

    public Fridge(String productName, String productID, String noFrost, String fridgeVolume, String height, String color, double price) {
        super(productName, productID, price);
        this.noFrost = noFrost;
        this.fridgeVolume = fridgeVolume;
        this.height = height;
        this.color = color;
    }

    public String getNoFrost() {
        return noFrost;
    }

    public void setNoFrost() {
        this.noFrost = noFrost;
    }

    public String getFridgeVolume() {
        return fridgeVolume;
    }

    public void setFridgeVolume() {
        this.fridgeVolume = fridgeVolume;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight() {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fridge:" +
                "\n  Product name: " + productName +
                "\n  Product ID: " + productID +
                "\n  NoFrost: " + noFrost +
                "\n  Fridge volume: " + fridgeVolume +
                "\n  Height: " + height +
                "\n  Color: " + color +
                "\n  Price: " + price + "\n";
    }
}
