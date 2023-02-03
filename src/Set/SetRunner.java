package Set;

import java.util.HashSet;
import java.util.Set;

public class SetRunner {
    public static void main(String[] args) {

        Set<Car> sixCars = new HashSet<>();
        sixCars.add(new Car("Mercedes","R class", 50));
        sixCars.add(new Car("Audi","A4", 35));
        sixCars.add(new Car("Renault","Logan", 25));
        sixCars.add(new Car("Bmw","5 Series", 75));
        sixCars.add(new Car("WV","Golf", 20));

        Set<Car> europaCars = new HashSet<>();
        europaCars.add(new Car("Bentley","Continetal", 250));
        europaCars.add(new Car("Audi","A4", 35));
        europaCars.add(new Car("WV","Golf", 20));
        europaCars.add(new Car("Rools - Royce","Cullinan", 500));
        europaCars.add(new Car("Aston Martin","Krytaya", 320));

        Set<Car> uniqueCars = new HashSet<>(sixCars);
        uniqueCars.addAll(europaCars);
        print(uniqueCars);
    }



    private static void print(Set<Car> cars) {
        System.out.printf("%20s %20s %20s\n","Car Brand","Model", "PricePerDay");
        for(Car car: cars){
            System.out.printf("%20s %20s %20s\n", car.getCarBrand(),car.getModel(),car.getPricePerDay());
        }
    }
}
