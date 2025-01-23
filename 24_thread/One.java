// class One extends thread{
//     public void run(){
//         System.out.println("Now here is threa running on");
//     }
// }

// class One implements Runnable{
//     public void run(){
//         System.out.println("Another way of implimentation");
//     }
// }

// ------------------------- Extend Example------------------------
/*
class One extends Thread{
    public void run(){
        System.out.println("Thid code running in Thread");
    }
    public static void main(String args[]){
        One thread = new One();
        thread.start();
        System.out.println("This code is outside of the Thread");
    }
} */

// ------------------------Implement Example---------------------------
class One implements Runnable{
    public void run(){
        System.out.println("This is in the Inside");
    }

    public static void main(String[] args) {
        One obj = new One();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This is outer one");
    }
}