package homework8;

/*
Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
меньше средней, а также их длину
 */

public class Homework8_3 {
    public static void main(String[] args) {
        Precondition preconditon = new Precondition();
        preconditon.setStrings();

        // вычисление средней длины строк
        int totalLength = 0;
        for (String s : preconditon.strings) {
            totalLength += s.length();
        }
        double averageLength = (double) totalLength / preconditon.strings.length;
        // вывод строк, у которых длина меньше средней
        System.out.println("Строки, у которых длина меньше средней (" + averageLength + "):");
        for (String s : preconditon.strings) {
            if (s.length() < averageLength) {
                System.out.println("- " + s + " (длина: " + s.length() + ")");
            }
        }
    }
}
