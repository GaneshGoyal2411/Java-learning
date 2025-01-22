import java.util.ArrayList;
import java.util.Iterator;

class Sec{
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(8);
        nums.add(12);
        nums.add(20);

        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            if(i < 10){
                it.remove();
            }
        }
        System.out.println(nums);
    }
}