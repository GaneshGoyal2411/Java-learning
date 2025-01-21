import java.util.LinkedList;
import java.util.Collections;
class Sec{
    public static void main(String[] args) {
        java.util.LinkedList<String> cars = new LinkedList<>();

        cars.add("abc");
        cars.add("xyz");
        cars.add("abb");
        cars.add("baa");

        Collections.sort(cars);

        // for(String i :cars){
        //     System.out.println(i);
        // }

        // for(int i=0; i<cars.size(); i++){
        //     System.out.println(cars.get(i));
        // }

        System.out.println(cars);
    }
}