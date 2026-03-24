package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_4 {

    /*
    Для всех задач исходные условия следующие: пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную. Попробовать оба
варианта. После заполнения массива данными, решить для него следующие
задачи:

Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
вывести сообщение, что их нет.
     */

    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size]; // задаем размер массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент [" + i + "]: ");
            array[i] = scanner.nextInt(); // ввод каждого элемента
        }
        System.out.println("Массив успешно заполнен!");
        scanner.close();
        System.out.println(Arrays.toString(array)); // выводим заполненный массив

        // перебор массива
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        // вывод результата
        if (count > 0) {
            System.out.println("Количество нулевых элементов в массиве: " + count);
        } else {
            System.out.println("В массиве нет нулевых элементов");
        }
    }
}
