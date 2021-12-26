package kata6;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.*;

public class Kata6 {

    public static void main(String[] args) {
        ToyBusiness business = new ToyBusiness();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        
        ArrayList<Car> coches = new ArrayList<Car>();
        ArrayList<Helicopter> helicopteros = new ArrayList<Helicopter>();
        
        while (!"exit".equals(line = in.nextLine())){
            switch (line) { 
                case "car":
                    coches.add(business.createCar());
                    System.out.println(
                            "Coches: " + coches.stream()
                                    .map(coche -> coche.getSerialNumber().toString())
                                    .collect(Collectors.joining(", ")));
                    break;
                case "helicopter":
                    helicopteros.add(business.createHelicopter());
                    System.out.println(
                            "Helicopteros: " + helicopteros.stream()
                                    .map(h -> h.getSerialNumber().toString())
                                    .collect(Collectors.joining(", ")) );
                    break;
                default:
                    System.out.println("Command unkown");
                    break;
            }
        }
        System.out.println("Fin de la ejecución");
    } 
}
