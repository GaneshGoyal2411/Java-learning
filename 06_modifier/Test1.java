public class Test1{
    // final int x = 10;
    // final double y = 10.9;

    // public static void main(String[] args) {
    //     Test1 myObj = new Test1();
    //     int z =myObj.x;
    //     System.out.println(z);
    // }

    static void myStaticM(){
        System.out.println("Here is Static M called");
    }
    public void myPublicM(){
        System.out.println("Here is Public M called");
    }

    public static void main(String[] args) {
        myStaticM();
        Test1 myObj = new Test1();
        myObj.myPublicM();
    }
}