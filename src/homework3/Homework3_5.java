package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_5 {

    /* Для всех задач исходные условия следующие: пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную. Попробовать оба
варианта. После заполнения массива данными, решить для него следующие
задачи:

Пройти по массиву и поменять местами элементы первый и последний, второй
и предпоследний и т.д.
     */

    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[size]; // задаем размер массива
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // заполняем массив случайными числами
        }
        System.out.println("Массив успешно заполнен!");
        System.out.println(Arrays.toString(array)); // выводим заполненный массив
        System.out.println();

        for (int i = 0; i < array.length / 2; i++) {
            // Временная переменная для обмена
            int temp = array[i];

            // Меняем местами i-й элемент с соответствующим с конца
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println(java.util.Arrays.toString(array));
    }
}
