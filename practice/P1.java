package practice;
interface Tom{
    void show();
}

class J{
    public static void show2(){
        System.out.println("try to use functional interface show method");
    }
}

public class P1 {
    public static void main(String[]args){
        Tom s = J :: show2;
        s.show();
    }    

}