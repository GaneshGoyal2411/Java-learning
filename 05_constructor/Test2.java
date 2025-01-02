public class Test2{
    // int modelYear;
    // String modelName;

    // public Test2(int year, String name){
    //     modelYear = year;
    //     modelName = name;
    // }

    // public static void main(String[] args) {
    //     Test2 myCar = new Test2(1996, "Sudan");
    //     System.out.println(myCar.modelName+""+myCar.modelYear);
    // }

    String bottleBrand;
    int bottlePrice;

    public Test2(String brand, int price){
        bottleBrand = brand;
        bottlePrice = price;
    }

    public static void main(String[] args) {
        Test2 myBottle = new Test2("plastic", 500);
        Test2 myBottle2 = new Test2("Cello",1250);
        System.out.println(myBottle.bottleBrand+" "+myBottle2.bottlePrice);
        System.out.println(myBottle2.bottleBrand+" "+myBottle2.bottlePrice);

    }
}