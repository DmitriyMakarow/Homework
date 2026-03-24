package homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework3_11 {

    /*
    Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).

Посчитать сумму четных элементов стоящих над побочной диагональю (не
включительно)
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
        int sum = 0;
        for (int i = 0; i < n - 1; i++) { // строки до предпоследней
            // Для каждой строки определяем диапазон столбцов над побочной диагональю
            for (int j = 0; j < n - i - 1; j++) { // столбцы до побочной диагонали
                if (matrix[i][j] % 2 == 0) { // проверка на чётность
                    sum += matrix[i][j];
                }
            }
        }
        // Вывод результата
        System.out.println("\nСумма чётных элементов, стоящих над побочной диагональю (не включительно): " + sum);
        scanner.close();
    }
}
