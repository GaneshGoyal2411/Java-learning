class Sec{
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
}