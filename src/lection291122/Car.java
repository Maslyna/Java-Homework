package lection291122;

import java.util.Objects;

public abstract class Car {
    private String name;
    private String model;
    private int year;
    private int horsePower;
    private int countWheels;
    private int speed;

    public Car(String name, String model, int year, int horsePower, int countWheels) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.horsePower = horsePower;
        this.countWheels = countWheels;
        this.speed = 0;
    }

    abstract void go();

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void stop(){
        this.speed = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getCountWheels() {
        return countWheels;
    }

    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && horsePower == car.horsePower && countWheels == car.countWheels && speed == car.speed && name.equals(car.name) && model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, year, horsePower, countWheels, speed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", horsePower=" + horsePower +
                ", countWheels=" + countWheels +
                ", speed=" + speed +
                '}';
    }
}
