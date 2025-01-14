class Outerclass{
    int x=10;

class InnerClass{
   int y=5;
}    
}

public class Fir {

    public static void main(String[] args) {
        Outerclass outerC = new Outerclass();
        Outerclass.InnerClass innerC = outerC.new InnerClass();

        System.out.println(outerC.x+innerC.y);
    }
}