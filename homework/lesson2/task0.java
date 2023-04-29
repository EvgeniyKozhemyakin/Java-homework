// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

package homework.lesson2;

public class task0 {
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        String result = countJewels(jewels, stones);
        System.out.print(result);
        
    }

    public static String countJewels(String jewels, String stones) {
        int[] count = new int[128];

        for (int i = 0; i < stones.length(); i++) {
            count[stones.charAt(i)]++;   
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < jewels.length(); i++) {
            if (count[jewels.charAt(i)] > 0) {
                result.append(jewels.charAt(i)).append(count[jewels.charAt(i)]);
            }
        }

        return result.toString();
    }
}
