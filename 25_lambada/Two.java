import java.util.ArrayList;
import java.util.function.Consumer;
class Two{
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(10);
        nums.add(15);
        nums.add(20);

        Consumer<Integer> method = (num)->{
            System.out.println(num);  
        };
        nums.forEach(method);
    }
}