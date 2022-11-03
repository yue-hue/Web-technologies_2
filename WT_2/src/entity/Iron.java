package entity;

public class Iron extends Entity {
    private String maxPower;
    private String workingSurface;
    private String waterTankCapacity;

    public Iron(String productName, String productID, String maxPower, String workingSurface, String waterTankCapacity, double price) {
        super(productName, productID, price);
        this.maxPower = maxPower;
        this.workingSurface = workingSurface;
        this.waterTankCapacity = waterTankCapacity;
    }

    public String getMaxPower() {
        return maxPower;
    }

    public void setMaxPower() {
        this.maxPower = maxPower;
    }

    public String getWorkingSurface() {
        return workingSurface;
    }

    public void setWorkingSurface() {
        this.workingSurface = workingSurface;
    }

    public String getWaterTankCapacity() {
        return waterTankCapacity;
    }

    public void setWaterTankCapacity() {
        this.waterTankCapacity = waterTankCapacity;
    }

    @Override
    public String toString() {
        return "Iron:" +
                "\n  Product name: " + productName +
                "\n  Product ID: " + productID + '\'' +
                "\n  Max power: " + maxPower +
                "\n  Working surface: " + workingSurface +
                "\n  Water tank capacity: " + waterTankCapacity +
                "\n  Price: " + price + "\n";
    }
}
