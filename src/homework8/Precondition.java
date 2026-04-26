package homework8;

import java.util.Scanner;

public class Precondition {

    // Массив для хранения трёх строк
    String[] strings = new String[3];

    // Общий метод для заполнения массива тремя строками с консоли для задач 1-4
    public void setStrings() {
            try (Scanner scanner = new Scanner(System.in)) {
                for (int i = 0; i < strings.length; i++) {
                    // Локальная переменная для хранения ввода
                    String userInput = "";

                    // Вызов ввода через цикл do-while до тех пор, пока ввод не будет заполнен
                    do {
                        System.out.print("Введите непустую строку " + (i + 1) + ": ");
                        userInput = scanner.nextLine();

                        if (userInput.isEmpty()) {
                            System.out.println("Ошибка: строка не может быть пустой. Попробуйте еще раз.");
                        }
                    } while (userInput.isEmpty());

                    // Сохранение валидного ввода в массив
                    strings[i] = userInput;
                }
            }
        }
    }