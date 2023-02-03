package pattern.builder;

import lombok.Builder;

@Builder
public class Cars {
    private final String owner;
    private final String model;
    private final int price;
    private final int mileage;
    private final String lastDriver;
    private final int loadCapacity;


}
