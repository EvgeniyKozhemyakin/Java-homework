// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. 
// Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге.

package homework.lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    private Map<String, List<String>> phoneBook;

    public task1() {
        phoneBook = new HashMap<>();
    }

    public void addEntry(String name, String phoneNumber) {
        List<String> phoneNumbers = phoneBook.getOrDefault(name, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        phoneBook.put(name, phoneNumbers);
    }

    public List<String> findEntry(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public void displayAllEntries() {
        System.out.println("Все контакты в телефонной книге:");
        for (Map.Entry<String, List<String>> entry : phoneBook.entrySet()) {
            String name = entry.getKey();
            List<String> phoneNumbers = entry.getValue();
            System.out.println("Имя: " + name);
            System.out.println("Номера телефонов: " + phoneNumbers);
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {
        task1 phoneBook = new task1();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Меню:");
            System.out.println("1. Добавить новую запись");
            System.out.println("2. Поиск записей");
            System.out.println("3. Вывести все контакты");
            System.out.println("4. Выход");
            System.out.print("Выберите действие: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    scanner.nextLine(); 
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите номер телефона: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBook.addEntry(name, phoneNumber);
                    System.out.println("Запись успешно добавлена.");
                    break;
                case 2:
                    scanner.nextLine(); 
                    System.out.print("Введите имя для поиска: ");
                    String searchName = scanner.nextLine();
                    List<String> searchResult = phoneBook.findEntry(searchName);
                    if (searchResult.isEmpty()) {
                        System.out.println("Ничего не найдено.");
                    } else {
                        System.out.println("Результаты поиска:");
                        System.out.println(searchResult);
                    }
                    break;
                case 3:
                    phoneBook.displayAllEntries();
                    break;
                case 4:
                    System.out.println("Программа завершена.");
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
                    break;
            }

            System.out.println();
        } while (choice != 4);

        scanner.close();
    }
}
