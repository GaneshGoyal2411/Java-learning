public class Thir extends Thread{
    public static int amount = 0;

    public static void main(String args[]){
        Thir thread = new Thir();
        thread.start();
        while(thread.isAlive()){
            System.out.println("Waiting...");
        }
        System.out.println("Sec: "+amount);
        amount++;
        System.out.println("Sec: "+amount);
    }
    public void run(){
        amount++;
    }
}