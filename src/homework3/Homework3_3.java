package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_3 {

    /*
    Для всех задач исходные условия следующие: пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную. Попробовать оба
варианта. После заполнения массива данными, решить для него следующие
задачи:

Найти индексы минимального и максимального элементов и вывести в консоль.
     */

    public static void main(String[] args) {
        System.out.println("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[size]; // задаем размер массива
        for (int i = 0; i < array.length; i++) { // заполняем массив случайными числами
            array[i] = random.nextInt(100);
        }
        System.out.println("Массив успешно заполнен!");
        System.out.println(Arrays.toString(array));
        System.out.println();
        // инициализация индексами первого элемента
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < array.length; i++) { // цикл для поиска индексов
            if (array[i] > array[indexOfMax]) {
                indexOfMax = i; // обновление индекса максимума
            } else if (array[i] < array[indexOfMin]) {
                indexOfMin = i; // обновление индекса минимума
            }
        }
        System.out.println("индекс минимального элемента: " + indexOfMin);
        System.out.println("индекс максимального элемента: " + indexOfMax);
    }
}
