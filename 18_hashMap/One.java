import java.util.HashMap;
class One{
    public static void main(String args[]){
        HashMap<String , String> capitalCities = new HashMap<>();

        capitalCities.put("MP", "Indore");
        capitalCities.put("Indore", "Bhopal");
        capitalCities.put("UP", "Agra");
        capitalCities.put("CG", "Raipur");
        // capitalCities.remove("MP");
        // System.out.println(capitalCities.remove("MP"));
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("Indore")); // Get
        capitalCities.remove("Indore"); // remove
        // capitalCities.clear(); // remove all
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());
        // for(int i=0; i<capitalCities.size(); i++){
        //     System.out.println(capitalCities.get("MP"));
        // }
        // for(String city : capitalCities ){
        //     System.out.println(city);
        // }
    }
}