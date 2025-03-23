import java.util.*;

public class B7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi:");
        String string =  scanner.nextLine();

        String[] strings = string.toLowerCase().split("\\W+");
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        Set<String> word = new HashSet<>(list);
        List<String> sortedWord = new ArrayList<>(word);
        Collections.sort(sortedWord);
        System.out.println("So lan xuat hien");
        for(String w : sortedWord){
            int cnt = Collections.frequency(sortedWord, w)+1;
            System.out.println(w + " : " + cnt);
        }
    }
}
