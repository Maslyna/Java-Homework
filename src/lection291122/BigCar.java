package lection291122;

public class BigCar extends Car{
    public BigCar(String name, String model, int year, int horsePower, int countWheels) {
        super(name, model, year, horsePower, countWheels);
    }

    @Override
    void go() {
        setSpeed(40);
    }
}
