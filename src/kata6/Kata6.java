package kata6;

import business.ToyBusiness;
import factories.regionalfactories.AmericanCarToyFactory;
import factories.regionalfactories.AsianHelicopterToyFactory;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproduct.Toy;

public class Kata6 {

    public static void main(String[] args) {
        ToyBusiness business = new ToyBusiness();
        business.add("car", new AmericanCarToyFactory());
        business.add("helicopter", new AsianHelicopterToyFactory());
        
        Scanner in = new Scanner(System.in);
        String line = "";
        
        ArrayList<Toy> toys = new ArrayList<Toy>();
        
        while (!"exit".equals(line = in.nextLine())){
            switch (line) { 
                case "car":
                case "helicopter":
                    toys.add(business.produceToy(line));
                    System.out.println(
                            "Juguetes: " + toys.stream()
                                    .map(h -> h.toString())
                                    .collect(Collectors.joining(", ")) );
                    break;
                default:
                    System.out.println("Command unkown");
                    break;
            }
        }
        System.out.println("Fin de la ejecución.");
    } 
}
