package lection291122;

public class CarTest {
    public static void main(String[] args) {
        Garage garage = new Garage();
        System.out.println(garage);
        Car Tesla = new ElectroCar("tesla", "mk1", 2016, 600, 4);
        Car Mustang = new SportCar("mustang", "mk1", 1970, 200, 4);
        garage.getIn(Mustang);
        garage.getIn(Tesla);
        garage.getIn(Tesla);
        System.out.println(garage);
        garage.getOut(Mustang);
        System.out.println(garage);
        System.out.println(garage.getCountOfCar(Tesla) + " " + garage.getCountOfCar(Mustang));


    }

}
