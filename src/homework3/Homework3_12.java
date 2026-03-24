package homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework3_12 {

    /*
    Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).

Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
строкой и т. д.)
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
        System.out.println();
        System.out.println("Исходная матрица: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        // Создаем новую матрицу с перевернутыми размерами
        int[][] transposed = new int[cols][rows];
        // Основной алгоритм транспонирования
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        // Вывод результата
        System.out.println();
        System.out.println("Транспонированная матрица: ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
