package homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework3_9 {

    /*
    Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).

Вывести нечетные элементы находящиеся под главной диагональю
(включительно).
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер квадратной матрицы: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(51);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        // Вывод нечётных элементов под главной диагональю (включительно)
        System.out.println("\nНечётные элементы под главной диагональю (включительно):");
        boolean hasOddElements = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) { // условие для элементов под диагональю и на ней
                if (matrix[i][j] % 2 != 0) { // проверка на нечётность
                    System.out.print(matrix[i][j] + " ");
                    hasOddElements = true;
                }
            }
        }
        if (!hasOddElements) {
            System.out.println("Нечётных элементов под главной диагональю не найдено.");
        }
        scanner.close();
    }
}
