package lesson61;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(new Notebook("Model1", 8, 256, "Windows", "Black"));
        notebooks.add(new Notebook("Model2", 16, 512, "MacOS", "Silver"));
        notebooks.add(new Notebook("Model3", 8, 512, "Windows", "White"));
        notebooks.add(new Notebook("Model4", 16, 1024, "Linux", "Black"));

        Map<String, Object> filterCriteria = getFilterCriteria();
        Set<Notebook> filteredNotebooks = filterNotebooks(notebooks, filterCriteria);

        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook.getModel());
        }
    }

    public static Map<String, Object> getFilterCriteria() {
        Map<String, Object> filterCriteria = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Введите минимальное значение ОЗУ:");
                int minRam = scanner.nextInt();
                filterCriteria.put("ram", minRam);
                break;
            case 2:
                System.out.println("Введите минимальное значение объема ЖД:");
                int minStorage = scanner.nextInt();
                filterCriteria.put("storage", minStorage);
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String operatingSystem = scanner.nextLine();
                filterCriteria.put("operatingSystem", operatingSystem);
                break;
            case 4:
                System.out.println("Введите цвет:");
                String color = scanner.nextLine();
                filterCriteria.put("color", color);
                break;
            default:
                System.out.println("Некорректный выбор.");
                break;
        }

        return filterCriteria;
    }

    public static Set<Notebook> filterNotebooks(Set<Notebook> notebooks, Map<String, Object> filterCriteria) {
        Set<Notebook> filteredNotebooks = new HashSet<>();

        for (Notebook notebook : notebooks) {
            boolean meetsCriteria = true;

            for (Map.Entry<String, Object> entry : filterCriteria.entrySet()) {
                String field = entry.getKey();
                Object value = entry.getValue();

                if (field.equals("ram")) {
                    int minRam = (int) value;
                    if (notebook.getRam() < minRam) {
                        meetsCriteria = false;
                        break;
                    }
                } else if (field.equals("storage")) {
                    int minStorage = (int) value;
                    if (notebook.getStorage() < minStorage) {
                        meetsCriteria = false;
                        break;
                    }
                } else if (field.equals("operatingSystem")) {
                    String operatingSystem = (String) value;
                    if (!notebook.getOperatingSystem().equalsIgnoreCase(operatingSystem)) {
                        meetsCriteria = false;
                        break;
                    }
                } else if (field.equals("color")) {
                    String color = (String) value;
                    if (!notebook.getColor().equalsIgnoreCase(color)) {
                        meetsCriteria = false;
                        break;
                    }
                }
            }

            if (meetsCriteria) {
                filteredNotebooks.add(notebook);
            }
        }

        return filteredNotebooks;
    }
}
