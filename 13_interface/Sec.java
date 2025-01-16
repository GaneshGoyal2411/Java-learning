interface FirstInterface{
    public void myFirstMethod();
}
interface SecondInterface{
    public void mySecondmethod();
}


class Combine implements FirstInterface, SecondInterface{
    public void mySecondmethod(){
        System.out.println("My Second method");
    }
    public void myFirstMethod(){
        System.out.println("My First method");
    }
    
   }

public class Sec{
    public static void main(String[] args) {
        Combine combine = new Combine();
        combine.myFirstMethod();
        combine.mySecondmethod();
    }
}
