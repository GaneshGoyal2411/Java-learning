/*enum Level{
    Low,
    MEDIUM,
    HIGH
}

public class One {
    public static void main(String[] args) {
        Level myObj = Level.Low;
        System.out.println(myObj);
    }
}*/

// ------------- Sec one-------------------------
/*public class One{
    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {
        Level mLevel = Level.HIGH;
        System.out.println(mLevel);
    }
}*/

// ---------- With switch case ---------------------
/*
public class One{
    enum Demo{
        LOW,
        MEDIUM,
        HIGH,
        reset
    }

    public static void main(String[] args) {
        Demo myObj = Demo.reset;
        System.out.println(myObj);

        switch (myObj) {
            case LOW:
                System.out.println("It's low level called");
                break;
            case MEDIUM:
                System.out.println("It's medium level called");
                break;
            case HIGH:
                System.out.println("It's High level called");
                break;
        
            default:
            System.out.println("It's unknown level called, please reset it");
                break;
        }
    }
} */

//------------------- With For each loop-------------------------------------
public class One{
    enum Level{
        HIGH,
        MEDIUM,
        LOW
    }

    public static void main(String args[]){
        for(Level myLevel: Level.values()){
            System.out.println(myLevel);
        }
    }
}

