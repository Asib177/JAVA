import java.util.ArrayList;
import java.util.Collections;

class First {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("Perado");
        Collections.sort(cars);
        // cars.set(0, "Opel");
        // cars.clear();
        // cars.remove(2);

        // System.out.println(cars);
        // System.out.println(cars.get(0));
        // System.out.println(cars);
        // System.out.println(cars.size());

        // for(int i = 0; i < cars.size(); i++) {
        //     System.out.println(cars.get(i));
        // }

        for(String i: cars) {
            System.out.println(i);
        }
    }
}

/*import java.util.ArrayList;

public class First {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(10);
        num.add(15);
        num.add(20);

        for(int i: num) {
            System.out.println(i);
        }
    }
}*/