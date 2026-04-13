package homework8;

/*
Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину.
 */

public class Homework8_1 {
    public static void main(String[] args) {
        Precondition precondition = new Precondition();
        precondition.setStrings();

        String shortest = precondition.strings[0];
        String longest = precondition.strings[0];

        // Поиск самой короткой и самой длинной строки
        for (int i = 1; i < 3; i++) {
            if (precondition.strings[i].length() < shortest.length()) {
                shortest = precondition.strings[i];
            }
            if (precondition.strings[i].length() > longest.length()) {
                longest = precondition.strings[i];
            }
        }
        // Вывод результатов
        System.out.println("Самая короткая строка: '" + shortest + "' (длина: " + shortest.length() + ")");
        System.out.println("Самая длинная строка: '" + longest + "' (длина: " + longest.length() + ")");
    }
}
