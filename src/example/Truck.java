package example;

public class Truck {
    private final String brand;
    private final String model;
    private final int age;
    private final int milleage;

    public Truck(String brand, String model, int age, int milleage) {
        this.brand = brand;
        this.model = model;
        this.age = age;
        this.milleage = milleage;
    }

    public static TruckBuilder builder() {
        return new TruckBuilder();
    }

    public static class TruckBuilder {
        private String brand;
        private String model;
        private int age;
        private int milleage;

        public TruckBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public TruckBuilder model(String model) {
            this.model = model;
            return this;
        }

        public TruckBuilder age(int age) {
            this.age = age;
            return this;
        }

        public TruckBuilder milleage(int milleage) {
            this.milleage = milleage;
            return this;
        }

        public Truck build(){
            return new Truck(brand, model, age, milleage);
        }
    }
}