package homework3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Homework3_1 {

    /* Для всех задач исходные условия следующие: пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную. Попробовать оба
варианта. После заполнения массива данными, решить для него следующие
задачи:

Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
*/

    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        Integer size = scanner.nextInt();
        Random random = new Random();
        Integer[] numbers = new Integer[size]; // задаем размер массива
        for (Integer i = 0; i < numbers.length; i++) { // заполняем массив случайными числами
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Массив успешно заполнен!");
        System.out.println(Arrays.toString(numbers)); // выводим заполненный массив
        System.out.println();

        Arrays.sort(numbers); // сортируем элементы массива в прямом порядке
        System.out.println("Вывод всех элементов массива в прямом порядке: ");
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        Arrays.sort(numbers, Collections.reverseOrder()); // сортируем элементы массива в обратном порядке
        System.out.println("Вывод всех элементов массива в обратном порядке: ");
        System.out.println(Arrays.toString(numbers));
        System.out.println();
    }
}
