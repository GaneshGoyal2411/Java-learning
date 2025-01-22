import java.util.HashSet;
class Pra{
    public static void main(String args[]){
        HashSet<Integer> nums = new HashSet<>();

        nums.add(4);
        nums.add(6);
        nums.add(9);
        nums.add(11);
        nums.add(3);

        // for(int num = 1; num<nums.size(); num++){
            for(int num = 1; num<=10; num++){
            if(nums.contains(num)){
                System.out.println(num+" is available in the Set");
            }
            else{
                System.out.println(num+" is not part of the Set");
            }
        }
    }
}