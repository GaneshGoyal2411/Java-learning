class Demo{
    public static void main(String[] args) {
        try{
            int [] nums = {1,2,3};
            System.out.println(nums[5]);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}