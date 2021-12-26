package business;

import toyproduct.Toy;
import toyproduct.models.AmericanHelicopterToy;
import toyproduct.models.AmericanCarToy;
import toys.SerialNumberGenerator;

public abstract class ToyBusiness {
    final protected SerialNumberGenerator generator = new SerialNumberGenerator();
    
    public abstract Toy createToy(String type);
    
    /*public Toy createToy(String type) {
        switch(type){
            case "car":
                AmericanCarToy car = new AmericanCarToy(this.generator.next());
                car.pack();
                car.label();
                return car;
            case "helicopter":
                AmericanHelicopterToy helicopter = new AmericanHelicopterToy(this.generator.next());
                helicopter.pack();
                helicopter.label();
                return helicopter;
            default:
                return null;
        }
        
    }*/
}
