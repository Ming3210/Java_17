import java.util.HashSet;

public class B6 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        HashSet<Integer> set3 = new HashSet<Integer>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set2.add(30);
        set2.add(40);
        set2.add(50);
        set2.add(60);

        set3.addAll(set1);
        set3.retainAll(set2);
        System.out.println(set3);
    }
}
