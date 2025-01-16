abstract class Animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzz");
    }
}

abstract class Dog extends Animal{
    public void sleep(){
        System.out.println("Dog is sleeping");
    }
}

public class One{
    public static void main(String[] args) {
        Animal aSound = new Dog();
        aSound.sleep();
    }
}