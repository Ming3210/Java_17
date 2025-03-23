import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class B8 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();
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

        int k = 11;
        ArrayList<Integer> numList = new ArrayList<>(numbers);

        ArrayList<String> pairs = new ArrayList<>();

        for (int i = 0; i < numList.size(); i++) {
            for (int j = i + 1; j < numList.size(); j++) {
                if (numList.get(i) + numList.get(j) == k) {
                    pairs.add("(" + numList.get(i) + ", " + numList.get(j) + ")");
                }
            }
        }

        Collections.sort(pairs);

        if (pairs.isEmpty()) {
            System.out.println("Ko thay cap nao");
        } else {
            System.out.println("Cac cap (a, b) co tong bang " + k + ":");
            for (String pair : pairs) {
                System.out.println(pair);
            }
        }

        System.out.println(pairs);
    }
}
