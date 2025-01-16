// class Outerclass{
//     int x=10;

// private class InnerClass{
//    int y=5;
// }    
// }

// class Outerclass{
//     int x=10;

// static class Innerclass{
//     int y=5;
// }
// }

class Outerclass{
    int x=10;

class InnerClass{
    public int myInnerMwthod(){
        return x;
    }
}
}


public class Fir {

    public static void main(String[] args) {
        Outerclass outerC = new Outerclass();
        Outerclass.InnerClass innerC = outerC.new InnerClass();

        System.out.println(innerC.myInnerMwthod());
    }
}