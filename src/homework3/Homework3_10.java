package homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework3_10 {

    /*
    Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).

Проверить произведение элементов какой диагонали больше.
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
        // Вычисляем произведения элементов главной диагонали
        int main = 1;
        for (int i = 0; i < n; i++) {
            main *= matrix[i][i];
        }
        // Вычисляем произведения элементов побочной диагонали
        int secondary = 1;
        for (int i = 0; i < n; i++) {
            secondary *= matrix[i][n - i - 1];
        }
        // Вывод результатов
        System.out.println("\nПроизведение элементов главной диагонали: " + main);
        System.out.println("Произведение элементов побочной диагонали: " + secondary);

        // Сравнение произведений и вывод результата
        System.out.println("\nРезультат сравнения:");
        if (main > secondary) {
            System.out.println("Произведение элементов главной диагонали больше.");
        } else if (secondary > main) {
            System.out.println("Произведение элементов побочной диагонали больше.");
        } else {
            System.out.println("Произведения элементов обеих диагоналей равны.");
        }
        scanner.close();
    }
}
