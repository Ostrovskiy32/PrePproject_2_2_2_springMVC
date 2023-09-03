package web.model;


import java.util.Objects;

public class Car {
    private String model;
    private int manufacturedYear;
    private double engineCapacity;

    public Car(String model, int manufacturedYear, double engineCapacity) {
        this.model = model;
        this.manufacturedYear = manufacturedYear;
        this.engineCapacity = engineCapacity;
    }


    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public void setSeries(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return manufacturedYear == car.manufacturedYear && Double.compare(engineCapacity, car.engineCapacity) == 0 && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, manufacturedYear, engineCapacity);
    }
}
