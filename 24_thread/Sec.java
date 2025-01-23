public class Sec extends Thread{
    public void run(){
        amount++;
    }
    public static int amount = 0;
    public static void main(String[] args) {
        Sec thread = new Sec();
    thread.start();
    System.out.println(amount);
    amount++;
    System.out.println(amount);    
    }
    
}