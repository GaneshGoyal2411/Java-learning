class One{
    public static void main(String args[]){

        try{
            int [] nums = {10,15,200};
            System.out.println(nums[2]);
            System.out.println(nums[3]);
        } 
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("it's final now");
        }
    }
}
