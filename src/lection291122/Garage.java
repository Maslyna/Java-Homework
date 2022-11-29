package lection291122;

import java.util.HashMap;

public class Garage {
    private HashMap<Car, Integer> hashMap = new HashMap<>();

    void getIn(Car o) {
        if (hashMap.containsKey(o)) {
            hashMap.put(o, (hashMap.get(o) + 1));
        } else {
            hashMap.put(o, 1);
        }
    }

    void getOut(Car o) {
        if (hashMap.containsKey(o)){
            if (hashMap.containsValue(1)) {
                hashMap.remove(o, 1);
            } else {
                hashMap.put(o, hashMap.get(o) - 1);
            }
        } else {
            System.out.println("Нема такої машини");
        }
    }

    int getCountOfCar(Car o) {
        return hashMap.getOrDefault(o, 0);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "hashMap=" + hashMap +
                '}';
    }
}
