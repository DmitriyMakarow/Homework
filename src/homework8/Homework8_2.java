package homework8;

/*
Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
возрастания значений их длины.
 */

public class Homework8_2 {
    public static void main(String[] args) {
        Precondition precondition = new Precondition();
        precondition.setStrings();

        // сортировка строк по возрастанию их длины
        for (int i = 0; i < precondition.strings.length - 1; i++) {
            for (int j = 0; j < precondition.strings.length - 1 - i; j++) {
                // сравнение длин соседних строк
                if (precondition.strings[j].length() > precondition.strings[j + 1].length()) {
                    // изменение порядка строк
                    String temp = precondition.strings[j];
                    precondition.strings[j] = precondition.strings[j + 1];
                    precondition.strings[j + 1] = temp;
                }
            }
        }
        // вывод отсортированных строк
        System.out.println("Строки в порядке возрастания длины: ");
        for (String s : precondition.strings) {
            System.out.println(s);
        }
    }
}
