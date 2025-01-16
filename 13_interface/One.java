interface Animal{
    public void animalSound();
    public void sleep();
}

class Pig implements Animal{
    public void animalSound(){
        System.out.println("Wee wee...");
    }

    public void sleep(){
        System.out.println("Zzz");
    }
}

public class One{
    public static void main(String args[]){
        Pig myPig = new Pig();
        myPig.sleep();
        myPig.animalSound();

        // Animal my2Pig = new Pig();
        // my2Pig.sleep();
        // my2Pig.animalSound();
    }
}