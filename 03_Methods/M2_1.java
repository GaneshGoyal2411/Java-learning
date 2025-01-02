public class M2_1{
//     static void myMethod(){
//         System.out.println("Hello World");
//     }

//     public static void main(String[] args) {
//         myMethod();
//     }
// }

//----------------------Static and Public method-----------------------------------
    // static void myStaticM(){
    //     System.out.println("Yes here is Static called out...");
    // }
    // public void myPublicM(){
    //     System.out.println("Now here is Public call out");
    // }

    // public static void main(String[] args) {
    //     M2_1 obj1 = new M2_1();
    //     obj1.myPublicM();
    //     myStaticM();
    // }

    //------------ 02--------------------------------------------------
    public void fullThrottle(){
        System.out.println("The car would be run as fast as it can be");
    }
    public void speed(int maxSpeed){
        System.out.println("Speed is : "+maxSpeed);
    }

    public static void main(String[] args) {
        M2_1 myCar = new M2_1();
        myCar.fullThrottle();
        myCar.speed(120);
    }
}

