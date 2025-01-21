import java.util.LinkedList;
// import java.util.Collections;
class One{
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Dsire");
        strings.add("Balano");
        strings.add("Hanto");
        strings.add("NahiTo");
        // Collections.sort(strings);

        // for(String string : strings){
        //     System.out.println(string);
        // }
        // System.out.println(strings.size());
        // strings.remove(2);
        // System.out.println(strings);

        //****************LinkedList Methods****************
        strings.addFirst("Furrari");
        strings.addLast("LastCar");
        strings.removeFirst();
        strings.removeLast();
        System.out.println(strings.getLast());
        // System.out.println(strings);

    }
}

/************************When To Use **************************
Use an ArrayList for storing and accessing data, and LinkedList to manipulate data. */