package lection291122;

public class ElectroCar extends Car {

    public ElectroCar(String name, String model, int year, int horsePower, int countWheels) {
        super(name, model, year, horsePower, countWheels);
    }

    @Override
    void go() {
        setSpeed(50);
    }
}
