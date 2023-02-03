package pattern.builder;

public class App {

    public Cars lexusKG() {
        return Cars.builder()
                .owner("Lexus.kg")
                .model("Lexus LX600")
                .price(12000)
                .build();
    }
    public Cars mashinaKG(){
        return Cars.builder()
                .owner("Частное лицо.")
                .model("Lexus LX600")
                .price(10000)
                .mileage(8000)
                .lastDriver("Atambaev")
                .build();
    }
    public Cars kbCars(){
        return Cars.builder()
                .owner("Kb")
                .model("BMW e60")
                .price(20000)
                .mileage(8000)
                .lastDriver("Ivanov")
                .loadCapacity(2260)
                .build();
    }

}
