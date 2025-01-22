import java.util.ArrayList;
import java.util.Iterator;
class One{
    public static void main(String args[]){
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volvo");
        cars.add("Tata");
        cars.add("Ford");
        cars.add("BMW");

        Iterator<String> it = cars.iterator();
        System.out.println(it.next()); // for first element
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}