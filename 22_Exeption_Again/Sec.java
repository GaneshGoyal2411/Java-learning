/*class Sec{
    static void checkAge(int age){
        if(age < 18){
            throw new ArithmeticException("You are not enough old");
        }
        else{
            System.out.println("You are enough old");
        }
    }

    public static void main(String args[]){
        checkAge(18);
    }
}*/

class Sec{
    public static void main(String args[]){
        try{
            int [] x = {1,2,3};
            System.out.println(x[1]);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("finally we are here now");
        }
    }
}