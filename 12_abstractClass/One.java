// abstract class Animal{
//     public abstract void animalSound();
//     public void sleep(){
//         System.out.println("Zzz");
//     }
// }

// abstract class Dog extends Animal{
//     public void sleep(){
//         System.out.println("Dog is sleeping");
//     }
// }

//------------------------------------------------------
abstract class Animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzz...");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig say : We we wee");
    }
}

public class One{
    public static void main(String[] args) {
        Animal suar = new Pig();
        suar.animalSound();
        suar.sleep();
    }
}