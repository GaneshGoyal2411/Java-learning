import java.util.ArrayList;
class One{
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(9);
        nums.add(3);
        nums.add(6);

        nums.forEach( (num)->{
            System.out.println(num);
        });
    }
}