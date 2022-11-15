package lection_8_11_22;//package lection_8_11_22;
//
//class Car {
//
//    double speed;
//    String model;
//    Motor motor = new Motor(100);
//    Weels weels = new Weels(4);
//
//    public Car(double speed, String model) {
//        this.speed = speed;
//        this.model = model;
//        weels.weels = 2;
//    }
//
//    double Drive(){
//        return speed++;
//    }
//
//    double Stop(){
//        return speed = 0;
//    }
//
//    class Motor {
//        double horsePower;
//
//        public Motor(double horsePower) {
//            this.horsePower = horsePower;
//        }
//
//        public double getHorsePower() {
//            return horsePower;
//        }
//
//        public void setHorsePower(double horsePower) {
//            this.horsePower = horsePower;
//        }
//    }
//
//    static class Weels{
//
//        private int weels;
//
//        public Weels(int weels) {
//            this.weels = weels;
//        }
//
//        public void setWeels(int weels) {
//            this.weels = weels;
//        }
//
//        public int getWeels() {
//            return weels;
//        }
//    }
//
//    void changeCar(double speed, double horsePower, int colesa){
//        this.speed = speed;
//        motor.setHorsePower(horsePower);
//        weels.setWeels(colesa);
//    }
//
//
//}

class Car {

    double speed;
    String model;
    Motor motor = new Motor(100);
    Colesa colesa = new Colesa(4);

    public Car(double speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    double Drive(){
        return speed++;
    }

    double Stop(){
        return speed = 0;
    }

    class Motor {
        double horsePower;

        public Motor(double horsePower) {
            this.horsePower = horsePower;
        }

        public double getHorsePower() {
            return horsePower;
        }

        public void setHorsePower(double horsePower) {
            this.horsePower = horsePower;
        }
    }

    public static class Colesa {
        private int colesa;

        public Colesa(int colesa) {
            this.colesa = colesa;
        }

        public void setColesa(int num){
            this.colesa = num;
        }
    }

    void changeCar(double speed, double horsePower, int colesa){
        this.speed = speed;
        this.motor.setHorsePower(horsePower);
        this.colesa.setColesa(colesa);
    }

    @Override
    public String toString() {
        return speed + " " + model + " " + motor.horsePower + " " + colesa.colesa ;
    }
}

public class Cartest {
    public static void main(String args[])
    {
        Car car = new Car(20, "BMW");

        System.out.println(car.toString());
        car.changeCar(30, 200, 12);
        System.out.println(car.toString());
    }
}