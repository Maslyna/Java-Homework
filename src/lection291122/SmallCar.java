package lection291122;

public class SmallCar extends Car{

    public SmallCar(String name, String model, int year, int horsePower, int countWheels) {
        super(name, model, year, horsePower, countWheels);
    }

    @Override
    void go() {
        setSpeed(60);
    }
}
