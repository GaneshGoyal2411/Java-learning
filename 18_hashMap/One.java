import java.util.HashMap;
class One{
    public static void main(String args[]){
        HashMap<String , String> capitalCities = new HashMap<>();

        capitalCities.put("MP", "Indore");
        capitalCities.put("MP", "Bhopal");
        capitalCities.put("UP", "Agra");
        capitalCities.put("CG", "Raipur");
        capitalCities.remove("MP");
        // System.out.println(capitalCities.remove("MP"));
        System.out.println(capitalCities);

        // for(int i=0; i<capitalCities.size(); i++){
        //     System.out.println(capitalCities.get("MP"));
        // }
        // for(String city : capitalCities ){
        //     System.out.println(city);
        // }
    }
}