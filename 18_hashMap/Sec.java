import java.util.HashMap;
class Sec{
    public static void main(String[] args) {
        HashMap<String, String> stateCity = new HashMap<>();
        stateCity.put("mp", "indore");
        stateCity.put("mh", "mumbai");
        stateCity.put("goa", "padgi");
        stateCity.put("up", "agra");
// ------------------------------- By Key--------------------------
        // for(String i : stateCity.keySet()){
        //     System.out.println(i);
        // }
// ----------------------------- By Values --------------------------
        // for(String i : stateCity.values()){
        //     System.out.println(i);
        // }
// -------------------------- By Key & Value --------------------------
        for(String i : stateCity.keySet()){
            System.out.println("Key :"+i+" Values :"+stateCity.get(i));
        }
    }
}