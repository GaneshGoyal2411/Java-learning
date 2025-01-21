import java.util.LinkedList;
import java.util.Collections;

class Four{
    public static void main(String[] args) {
        LinkedList<String> bikes = new LinkedList<>();

        bikes.add("Yamaha");
        bikes.add("Honda");
        bikes.add("Sukuki");
        bikes.add("bajaj");

        Collections.sort(bikes, Collections.reverseOrder());
        for(String bike : bikes){
            System.out.println(bike);
        }
    }
}