import java.util.HashSet;
import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        HashSet<String> str = new HashSet<>();
        str.add("Java");
        str.add("Python");
        str.add("C++");
        str.add("JavaScript");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String input = scanner.nextLine();
        boolean isExist = str.contains(input);
        if(isExist) {
            System.out.println("Chuoi co ton tai trong danh sach.");
        }
        else {
            System.out.println("Chuoi khong ton tai trong danh sach.");
        }
    }
}
