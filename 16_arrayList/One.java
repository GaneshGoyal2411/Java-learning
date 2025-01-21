import java.util.ArrayList;
class One{
    public static void main(String args[]){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("volvo");
        cars.add("toofan");
        cars.add("baleno");
        cars.add("maruti");
/*
        cars.add(0,"thor");
        System.out.println(cars);
        System.out.println(cars.get(2)); // Get -------------------------------

        cars.set(0,"fortuner"); // Set / exchange------------------------------
        System.out.println(cars);

        cars.remove(3); // Remove ----------------------------------------------
        System.out.println(cars);
        // System.out.println(cars.remove(0)); // Additional--------------------------
        // System.out.println(cars);

        // cars.clear(); // Clear --------------------------------------------------------
       // Size ----------------------------------------------------------
        System.out.println(cars.size()); */

        // for Loop---------------------------------------------------------------------------------------------------------------------
        // for(int i=0; i<cars.size(); i++){
        //     System.out.println(cars.get(i));
        // }

        // For each loop-----------------------------------------------------------------------------------------------------------
    for(String i :cars){
        System.out.println(i);
    }
    }
}