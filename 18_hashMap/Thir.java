import java.util.HashMap;
class Thir{
    public static void main(String args[]){
        HashMap<String, Integer> people = new HashMap<>();

        people.put("Ganesh", 27);
        people.put("Atul", 22);
        people.put("Sachin", 24);
        people.put("Shivam", 25);

        for(String i : people.keySet()){
            System.out.println("Name:"+i+" Age:"+people.get(i));
        }
    }
}