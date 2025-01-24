import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Car{
   public String brand;
    public String model;
    public int year;

    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}

// Create comparator
class SortByYear implements Comparator{
    public int compare(Object obj1, Object obj2){
        Car a = (Car) obj1;
        Car b = (Car) obj2;

        // compare 
        if(a.year<b.year) return -1;
        if(a.year>b.year) return 1;
        return 0; // both years are same
    }
}

class One{
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "X5", 1999));
        cars.add(new Car("Honda", "Accord", 2006));
        cars.add(new Car("Ford", "Mustang", 1970));
    
        // Use a comparator to sort the cars
        Comparator myComparator = new SortByYear();
        Collections.sort(cars, myComparator);
    
        // Display the cars
        for (Car c : cars) {
          System.out.println(c.brand + " " + c.model + " " + c.year);
        }
    }
}