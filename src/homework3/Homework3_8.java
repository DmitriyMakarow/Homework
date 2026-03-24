package homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework3_8 {

    /*
    Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).

Посчитать сумму четных элементов стоящих на главной диагонали.
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
        for (int i = 0; i < n; i++) {
            if (matrix[i][i] % 2 == 0) {
                sum += matrix[i][i];
            }
        }
        System.out.println();
        System.out.println("Cумма четных элементов стоящих на главной диагонали: ");
        System.out.println(sum);
    }
}
