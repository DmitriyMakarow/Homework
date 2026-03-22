package homework2;

import java.util.Scanner;

public class Homework2_5

/*
Напишите программу, где пользователь вводит любое целое положительное
число. А программа суммирует все числа от 1 до введенного пользователем числа. Для
ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
пользователь не мог ввести некорректные данные
 */ {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;

        while (true) {
            System.out.print("Введите целое положительное число: ");
            System.out.println();

            // Проверка: является ли ввод целым числом
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                if (a > 0) {
                    break; // Ввод корректен, выводим из цикла
                } else {
                    System.out.println("Ошибка: число должно быть больше 0.");
                    System.out.println();
                }
            } else {
                System.out.println("Ошибка: введено не целое число.");
                System.out.println();
                scanner.next(); // Очистка некорректного ввода
            }
        }
        // суммирование чисел
        long sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + a + " = " + sum);
    }
}
