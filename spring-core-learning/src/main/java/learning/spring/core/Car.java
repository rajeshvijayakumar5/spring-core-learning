package learning.spring.core;

public class Car {
    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public String getCarFeature() {
        return "Car Engine made in " + engine.getCountryMake() + " with power of " + engine.getEnginePower() + "cc";
    }
}
