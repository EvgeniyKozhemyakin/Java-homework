// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его повторений в списке.
package homework.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task3 {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>(Arrays.asList("Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон", "Марс", "Земля"));

        Map<String, Integer> planetCounts = new HashMap<>();

        for (String planet : planets) {
            Integer count = planetCounts.get(planet);
            if (count == null) {
                count = 0;
            }
            planetCounts.put(planet, count + 1);
        }

        
        for (Map.Entry<String, Integer> entry : planetCounts.entrySet()) {
            String planet = entry.getKey();
            Integer count = entry.getValue();
            System.out.println(planet + ": " + count + " повторений");
        }
    }
}
