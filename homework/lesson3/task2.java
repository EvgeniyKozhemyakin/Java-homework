// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка. 
// Collections.max()
package homework.lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        double average = (double) sum / numbers.size();

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое значение: " + average);
    }
}
