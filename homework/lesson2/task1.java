// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
// Пример: s = “cba”, index = [3,2,1] result “abc”
package homework.lesson2;

public class task1 {
    public static void main(String[] args) {

        String s = "cbaf";
        int[] index = new int[] { 3, 2, 1, 0 };
        String a = shuffleString(s, index);
        System.out.println(a);

    }

    public static String shuffleString(String s, int[] index) {
        char[] shuffled = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            shuffled[index[i]] = s.charAt(i);
        }

        return new String(shuffled);
    }

}
