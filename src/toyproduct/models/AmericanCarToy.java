package toyproduct.models;

import toyproduct.Toy;

public class AmericanCarToy implements Toy{
    final private Integer serialNumber;
    final String type = "car";
    
    public AmericanCarToy(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    @Override
    public Integer getSerialNumber(){
        return this.serialNumber;
    }
    
    public String getType(){
        return this.type;
    }
    
    @Override
    public void pack(){
        System.out.printf("Packing '%s' '%d'\n",  this.type, this.serialNumber);
    }
    
     @Override
    public void label(){
        System.out.printf("Packing '%s' %d'\n", this.type, this.serialNumber);
    }
    
    @Override
    public String toString(){
        return "AmericanCarToy{" + "serialNumber=" + this.serialNumber + "}";
    }
}
