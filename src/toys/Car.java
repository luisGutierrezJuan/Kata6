package toys;

public class Car {
    final private Integer serialNumber;
    
    public Car(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public Integer getSerialNumber(){
        return this.serialNumber;
    }
    
    public void pack(){
        System.out.printf("Packing car '%d'\na", this.serialNumber);
    }
    
    public void label(){
        System.out.printf("Packing car '%d'\n", this.serialNumber);
    }
}
