package kata6;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toys.*;

public class Kata6 {

    public static void main(String[] args) {
        SerialNumberGenerator generator = new SerialNumberGenerator();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        
        ArrayList<Car> coches = new ArrayList<Car>();
        
        while (!"exit".equals(line = in.nextLine())){
            Car car = new Car(generator.next());
            car.pack();
            car.label();
            coches.add(car);
            System.out.println(
                    "Coches: " + coches.stream()
                            .map(coche -> coche.getSerialNumber().toString())
                            .collect(Collectors.joining(", ")));
        }
        System.out.println("Fin de la ejecución");
    } 
}
