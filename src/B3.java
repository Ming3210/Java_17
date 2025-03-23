import java.util.HashSet;
import java.util.Iterator;

public class B3 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println(numbers);

        Iterator<Integer> i = numbers.iterator();
        while (i.hasNext()) {
            int num = i.next();
            if (num % 2 == 0) {
                i.remove();
            }
        }
        System.out.println(numbers);
    }
}
