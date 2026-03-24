package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_2 {

    /* Для всех задач исходные условия следующие: пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную. Попробовать оба
варианта. После заполнения массива данными, решить для него следующие
задачи:

Найти минимальный - максимальный элементы и вывести в консоль.
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
        System.out.println();
        System.out.println("Массив успешно заполнен!");
        scanner.close();
        System.out.println(Arrays.toString(array)); // выводим заполненный массив
        int min = array[0]; // Инициализация минимума
        int max = array[0]; // Инициализация максимума
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // Нашли минимум
            }
            if (array[i] > max) {
                max = array[i]; // нашли максимум
            }
        }
        System.out.println();
        System.out.println("Минимальный элемент: " + min);
        System.out.println();
        System.out.println("Максимальный элемент: " + max);
    }
}
