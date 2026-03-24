package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework3_6 {
    /*
Для всех задач исходные условия следующие: пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную. Попробовать оба
варианта. После заполнения массива данными, решить для него следующие
задачи:

Проверить, является ли массив возрастающей последовательностью (каждое
следующее число больше предыдущего).
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
        System.out.println(Arrays.toString(array)); // выводим заполненный массив
        System.out.println();

        // вводим переменную флаг, которая обозначает возрастающая последовательность в массиве или нет. по дефолту true
        boolean flag = true;
        // если следующий элемент массива меньше или равен предыдущему, тогда установить флаг false и выйти из цикла
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                flag = false;
                break;
            }
        }
        // если флаг не изменился - массив возрастающий, если изменился => нет
        if (flag) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
    }
}
