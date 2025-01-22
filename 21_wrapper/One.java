import java.util.ArrayList;
class One{
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(5);
        nums.add(10);
        nums.add(15);
        nums.add(20);

        for(int i : nums){
            System.out.println(i);
        }
    }
}