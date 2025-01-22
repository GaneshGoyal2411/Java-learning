import java.util.HashSet;
class One{
    public static void main(String args[]){
        HashSet<String> cars = new HashSet<>();

        cars.add("Thar");
        cars.add("Scorpio");
        cars.add("Creta");
        cars.add("Punch");
        cars.add("scorpio"); // Double 

        // System.out.println(cars);
        // System.out.println(cars.contains("punch")); // Contains or Not
        cars.remove("scorpio");
        // System.out.println(cars);
        // cars.clear();
        // System.out.println(cars.size());

        // ------------By Loop ----------------------------------------
        for(String i : cars){
            System.out.println(i);
        }
    }
}