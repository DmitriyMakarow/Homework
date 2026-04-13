package homework8;

/*
Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo"
 */

import java.util.Scanner;

public class Homework8_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод строки с консоли
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        // Создание новой строки с задублированными символами
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Добавление текущего символа дважды
            result.append(currentChar).append(currentChar);
        }
        // Вывод результата
        System.out.println("Результат: " + result);
        scanner.close();
    }
}
