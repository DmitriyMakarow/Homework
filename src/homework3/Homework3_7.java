package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_7 {

    /*
Имеется массив из неотрицательных чисел(любой). Представьте что массив
представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} - > 999). Задача
добавить единицу к этому “числу” и на выходе получить исправленный массив.
Массив не содержит нуля в начале, кроме самого числа 0.
Пример:
Input: [1,4,0,5,6,3]
Output: [1,4,0,5,6,4]
Input: [9,9,9]
Output: [1,0,0,0]
     */

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        // Проходим с конца массива к началу
        for (int i = n - 1; i >= 0; i--) {
            // Добавляем 1 к текущей цифре
            digits[i]++;
            // Если нет переноса (цифра < 10), возвращаем массив
            if (digits[i] < 10) {
                return digits;
            }
            // Если цифра стала 10, устанавливаем 0 и продолжаем с переносом
            digits[i] = 0;
        }
        // Если все цифры были 9, создаём новый массив с увеличенной длиной
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Задаем размер массива
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        // Создание массива заданного размера
        int[] digits = new int[size];
        // Заполнение массива числами, которые ввел пользователь
        System.out.println("Введите " + size + " цифр (неотрицательных чисел от 0 до 9):");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            digits[i] = scanner.nextInt();
            // Проверка корректности ввода (цифры от 0 до 9)
            while (digits[i] < 0 || digits[i] > 9) {
                System.out.println("Ошибка! Введите цифру от 0 до 9: ");
                digits[i] = scanner.nextInt();
            }
        }
        // Вывод заполненного массива
        System.out.println();
        System.out.println("Массив успешно заполнен!");
        System.out.println(Arrays.toString(digits));
        // Выполнение операции добавления единицы
        int[] result = plusOne(digits);
        // Вывод результата
        System.out.println();
        System.out.println("Исправленный массив после добавления единицы: ");
        System.out.println(Arrays.toString(result));
        scanner.close();
    }
}
