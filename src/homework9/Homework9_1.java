package homework9;

/*
Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран.
При решении использовать коллекции.
 */

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Homework9_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос ввода у пользователя
        System.out.println("Введите набор чисел через запятую (например: 1, 2, 3, 4, 4, 5):");
        String input = scanner.nextLine();

        // Преобразование строки на массив подстрок
        String[] stringNumbers = input.split(",");

        // Создание коллекции для хранения уникальных элементов с сохранением порядка
        Set<String> uniqueNumbers = new LinkedHashSet<>();

        // Проход по массиву, удаление пробелов и добавление в коллекцию
        for (String num : stringNumbers) {
            uniqueNumbers.add(num.trim());
        }

        // Формирование итоговой строки для вывода
        String result = String.join(", ", uniqueNumbers);

        // Вывод результата
        System.out.println("Результат без дубликатов:");
        System.out.println(result);
        scanner.close();
    }
}
