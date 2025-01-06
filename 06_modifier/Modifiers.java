class Main{
    private int x = 20;
    public int y = 20;
    int z = 40;
    protected int a = 50;

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class Modifiers {
    public static void main(String[] args) {
        Main obj1 = new Main();
        obj1.meth1();
    }
}
