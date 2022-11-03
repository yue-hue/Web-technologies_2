package entity;

public class Kettle extends Entity {
    private String kettleType;
    private String waterVolume;
    private String housingMaterial;

    public Kettle(String productName, String productID, String kettleType, String waterVolume, String housingMaterial, double price) {
        super(productName, productID, price);
        this.kettleType = kettleType;
        this.waterVolume = waterVolume;
        this.housingMaterial = housingMaterial;
    }

    public String getTeapotType() {
        return kettleType;
    }

    public void setTeapotType() {
        this.kettleType = kettleType;
    }

    public String getWaterVolume() {
        return waterVolume;
    }

    public void setWaterVolume() {
        this.waterVolume = waterVolume;
    }

    public String getHousingMaterial() {
        return housingMaterial;
    }

    public void setHousingMaterial() {
        this.housingMaterial = housingMaterial;
    }

    @Override
    public String toString() {
        return "Kettle:" +
                "\n  ProductName: " + productName +
                "\n  ProductID: " + productID + '\'' +
                "\n  Kettle type: " + kettleType +
                "\n  Water volume: " + waterVolume +
                "\n  Housing material=" + housingMaterial +
                "\n  Price: " + price + "\n";
    }
}
