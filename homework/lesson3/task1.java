// Пусть дан произвольный список целых чисел, удалить из него четные числа
package homework.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        System.out.println("Введите числа:");

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        numbers.removeIf(number -> number % 2 == 0);

        System.out.println("Нечетные числа:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
