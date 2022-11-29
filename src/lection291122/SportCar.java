package lection291122;

public class SportCar extends  Car{
    public SportCar(String name, String model, int year, int horsePower, int countWheels) {
        super(name, model, year, horsePower, countWheels);
    }

    @Override
    void go() {
        setSpeed(180);
    }
}
