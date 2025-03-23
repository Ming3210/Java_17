package B10;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static HashSet<Contact> contacts = new HashSet<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("==============MENU================");
            System.out.println("1. Thêm liên lạc");
            System.out.println("2. Xóa liên lạc");
            System.out.println("3. Tìm kiếm liên lạc");
            System.out.println("4. In danh sách liên lạc");
            System.out.println("5. Thoát");
            System.out.print("Chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String phone = scanner.nextLine();
                    addContact(new Contact(name, phone));
                    break;
                case 2:
                    System.out.print("Nhập số điện thoại cần xóa: ");
                    String phoneToRemove = scanner.nextLine();
                    removeContact(phoneToRemove);
                    break;
                case 3:
                    System.out.print("Nhập số điện thoại cần tìm: ");
                    String phoneToFind = scanner.nextLine();
                    System.out.println(containsContact(phoneToFind) ? "Tồn tại" : "Không tồn tại");
                    break;
                case 4:
                    printContacts();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (true);
    }

    static void addContact(Contact contact) {
        if (contacts.add(contact)) {
            System.out.println("Đã thêm: " + contact);
        } else {
            System.out.println("Số " + contact.getPhoneNumber() + " đã tồn tại!");
        }
    }

    static void removeContact(String phoneNumber) {
        Contact temp = new Contact("", phoneNumber);
        if (contacts.remove(temp)) {
            System.out.println("Đã xóa liên lạc với số " + phoneNumber);
        } else {
            System.out.println("Không tìm thấy số " + phoneNumber);
        }
    }
    static boolean containsContact(String phoneNumber) {
        return contacts.contains(new Contact("", phoneNumber));
    }

    static void printContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Danh bạ trống!");
        } else {
            System.out.println("Danh sách liên lạc (" + contacts.size() + "):");
            contacts.forEach(System.out::println);
        }
    }
}