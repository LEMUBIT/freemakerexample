package lemubit.academy.freemakerexample;

public class Laptop {
     String brandName;
     String price;
     String ramSize;
     String processorType;

    public Laptop(String brandName, String price, String ramSize, String processorType) {
        this.brandName = brandName;
        this.price = price;
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRamSize() {
        return ramSize;
    }

    public void setRamSize(String ramSize) {
        this.ramSize = ramSize;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }
}
