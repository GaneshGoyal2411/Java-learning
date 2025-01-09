class Animal{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal{
    // @Override
    // public void animalSound(){
    //     System.out.println("The pig says: wee wee");
    // }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says: bow wow");
    }
}

public class Main1{
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal pig = new Pig();
        Dog dog = new Dog();
        animal.animalSound();
        pig.animalSound();
        dog.animalSound();
    }
}