package entity;

public class Microwave extends Entity {
    private String embeddingType;
    private String microwaveVolume;
    private String internalWallCovering;
    private String emitterPower;

    public Microwave(String productName, String productID, String embeddingType, String microwaveVolume, String internalWallCovering, String emitterPower, double price) {
        super(productName, productID, price);
        this.embeddingType = embeddingType;
        this.microwaveVolume = microwaveVolume;
        this.internalWallCovering = internalWallCovering;
        this.emitterPower = emitterPower;
    }

    public String getEmbeddingType() {
        return embeddingType;
    }

    public void setEmbeddingType() {
        this.embeddingType = embeddingType;
    }

    public String getMicrowaveVolume() {
        return microwaveVolume;
    }

    public void setMicrowaveVolume() {
        this.microwaveVolume = microwaveVolume;
    }

    public String getInternalWallCovering() {
        return internalWallCovering;
    }

    public void setInternalWallCovering() {
        this.internalWallCovering = internalWallCovering;
    }

    public String getEmitterPower() {
        return emitterPower;
    }

    public void setEmitterPower() {
        this.emitterPower = emitterPower;
    }

    @Override
    public String toString() {
        return "Microwave:" +
                "\n  Product name: " + productName +
                "\n  Product ID: " + productID +
                "\n  Embedding type: " + embeddingType +
                "\n  Microwave volume: " + microwaveVolume +
                "\n  Internal wall covering: " + internalWallCovering +
                "\n  Emitter power: " + emitterPower +
                "\n  Price: " + price + "\n";
    }
}
