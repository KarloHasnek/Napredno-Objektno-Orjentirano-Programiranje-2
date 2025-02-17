package pckg_simple_factory;

public abstract class Car {

    protected String brand;
    protected String model;

    protected Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    protected abstract void produceCar();
}

