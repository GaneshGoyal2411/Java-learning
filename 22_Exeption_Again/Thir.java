class Thir{
        static void checkAge(int age){
            if(age < 18){
                throw new ArithmeticException("Your age must be 18 or more than 18");
            }
            else{
                System.out.println("You are enough old");
            }
            }
            public static void main(String args[]){
                checkAge(8);
        }
    }
