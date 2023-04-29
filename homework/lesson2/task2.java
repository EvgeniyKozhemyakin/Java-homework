// На первой строке записывается натуральное число n - количество строчек в книге. 
// Затем вводится n строк - строки книги. потом вводится натуральное число m - количество продуктов, на которые у человека аллергия. 
// Потом вводится m строк - вида "продукт1 - продукт2", где продукт1 - продукт, на который у человека аллергия и продукт2 - продукт, на который следует заменить продукт1. 
// Гарантируется что любой продукт состоит из 1 слова. название продуктов написаны строчными буквами. 
// Гарантируется, что продукты, на которые нужно выполнить замену, не встречаются изначально в тексте.
// Выходные данные
// Замените все продукты в поваренной книге Васи и выведите их построчно на экран. 
// На окончания не обращайте внимание. ВАЖНО!!! 
// Если продукт, который следует заменить написан с большой буквы, то и замена тоже должна начинаться с большой буквы!
// Sample Input:
// 22
// Рецепт 1. Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.
// Рецепт 2. Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.
// 3
// арахис - колбаса
// клубника - вишня
// сгущенка - молоко
// Sample Output:
// Рецепт 1. Колбаса 100гр, мороженое 200гр. Возьмите колбаса и измелчите его. Посыпьте измельчённый колбаса на мороженое.
// Рецепт 2. Вишня 100гр, молоко 3кг. Смешать, есть) Радоваться жизни.

package homework.lesson2;

import java.util.*;

public class task2 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите количество строк в книге: ");
            int n = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Введите строки книги:");
            String[] book = new String[n];
            for (int i = 0; i < n; i++) {
                book[i] = scanner.nextLine();
            }

            System.out.print("Введите количество продуктов на которые у человека аллергия(слово1 - слово2): ");
            int m = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Введите " + m + " пар аллергических продуктов и их замен:");
            String[][] replacements = new String[m][2];
            for (int i = 0; i < m; i++) {
                String line = scanner.nextLine();
                String[] parts = line.split(" - ");
                replacements[i][0] = parts[0];
                replacements[i][1] = parts[1];
            }

            for (int i = 0; i < n; i++) {
                String line = book[i];
                StringBuilder sb = new StringBuilder();
                int start = 0;
                for (int j = 0; j < m; j++) {
                    String oldWord = replacements[j][0];
                    String newWord = replacements[j][1];
                    int index = line.toLowerCase().indexOf(oldWord.toLowerCase(), start);
                    while (index != -1) {
                        sb.append(line.substring(start, index));
                        sb.append(newWord);
                        start = index + oldWord.length();
                        index = line.toLowerCase().indexOf(oldWord.toLowerCase(), start);
                    }
                }
                sb.append(line.substring(start));
                System.out.println(sb.toString());
            }
        }
    }
}