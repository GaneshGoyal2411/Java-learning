public class Test2_mOverloading {

    // 01) 
    // int myMethod(int x)
    // float myMethod(float x)
    // double myMethod(double x, double y)

    // Pra 01 ---------------- while there are Integer and Double seprated------------------------ 
    // static int plusInteger(int x, int y){
    //     return x+y;
    // }
    // static double plusDouble(double x, double y){
    //     return x+y;
    // }

    // public static void main(String[] args) {
    //     int num1 = plusInteger(10,20);
    //     double num2 = plusDouble(4.5,10.5);

    //     System.out.println("Integer result:"+num1);
    //     System.out.println("Double result:"+num2);
    // }

// Pra 02 ---------------- while there are, Integer and Double not seprated------------------------

    // static int plusMethod(int a, int b){
    //     return a+b;
    // }
    // static double plusMethod(double a, double b){
    //     return a+b;
    // }

    // public static void main(String[] args) {
    //     int num1=plusMethod(75, 25);
    //     double num2=plusMethod(7.2 , 1.8); // IF require otherwise can comment

    //     System.out.println(num1);
    //     System.out.println(num2);
    // }
}

//----------------------- Scope of {} -------------------------------

public class Test3_Scope {

    public static void main(String[] args) {
        // System.out.println(x);
        int x =100;

    System.out.println(x);    
    }
}