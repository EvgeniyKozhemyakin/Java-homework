// Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, 
// Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, 
// Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности. 
// Для сортировки использовать TreeMap.
package homework.lesson5;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class task2 {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
                "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                "Петр Петин", "Иван Ежов");

        Map<String, Integer> countMap = new TreeMap<>(Collections.reverseOrder());

        for (String employee : employees) {
            countMap.put(employee, countMap.getOrDefault(employee, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
