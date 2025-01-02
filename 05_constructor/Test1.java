public class Test1{
    // int x;
    // // Constructor
    // Test1(){
    //     x = 5;
    // }

    // public static void main(String args[]){
    //     Test1 myObj = new Test1();
    //     System.out.println(myObj.x);
    // }

    // ------------- Another one-------------------
    int x ;
    // Test1(int y){
    //     x=y;
    // }

    public static void main(String[] args) {
        Test1 myObj = new Test1(5);
        Test1 myObj1 = new Test1(10);
        System.out.println(myObj.x);
        System.out.println(myObj1.x);
    }
}