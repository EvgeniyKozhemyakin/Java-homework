// * +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.

package lesson1Hw;

public class task3 {
    public static void main(String[] args) {
        for (int q = 0; q <= 9; q++) {
            for (int w = 0; w <= 9; w++) {
                for (int e = 0; e <= 9; e++) {
                    String expression = q + "" + w + "=" + e;
                    if (isValidExpression(expression)) {
                        System.out.println(expression);
                    }
                }
            }
        }
    }

    // метод, который проверяет, верно ли равенство для заданного выражения
    public static boolean isValidExpression(String expression) {
        // разбиваем выражение на левую и правую части
        String[] parts = expression.split("=");
        if (parts.length != 2) {
            return false;
        }
        String left = parts[0];
        String right = parts[1];

        // если в выражении есть вопросительные знаки, заменяем их на все возможные цифры
        left = left.replace("?", "{}");
        right = right.replace("?", "{}");
        String[] arguments = new String[2];
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                String tempLeft = left.replaceFirst("\\{\\}", String.valueOf(i));
                String tempRight = right.replaceFirst("\\{\\}", String.valueOf(j));
                if (tempLeft.equals(tempRight)) {
                    arguments[0] = String.valueOf(i);
                    arguments[1] = String.valueOf(j);
                    break;
                }
            }
        }

        // если обе части выражения содержат вопросительные знаки или не удалось найти соответствующие значения,
        // то выражение неверное
        if (arguments[0] == null || arguments[1] == null) {
            return false;
        }

        // проверяем, верно ли равенство для найденных значений
        return Integer.parseInt(arguments[0]) + Integer.parseInt(arguments[1]) == Integer.parseInt(right);
    }
}
