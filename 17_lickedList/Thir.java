import java.util.LinkedList;
import java.util.Collections;

class Thir{
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(100);
        numbers.add(80);
        numbers.add(90);
        numbers.add(60);
        numbers.add(70);

        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);
    }
}