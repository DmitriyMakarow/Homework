package homework8;

/*
Ввести 3 строки с консоли. Найти слово, состоящее только из различных
символов. Если таких слов несколько, найти первое из них.
 */

import java.util.Scanner;

public class Homework8_4 {
    public static void main(String[] args) {
        Precondition precondition = new Precondition();
        precondition.setStrings();

        // Проверка на уникальность символов в строке
            String result = findFirstWordWithUniqueChars(precondition.strings);
            if (result != null) {
                System.out.println("Первое слово, состоящее только из различных символов: " + result);
            } else {
                System.out.println("Слов, состоящих только из различных символов, не найдено.");
            }
        }
        // Метод проверяет, состоит ли строка только из уникальных символов
        private static boolean hasAllUniqueChars(String word) {
            // Преобразование строки в массив символов для удобства работы с индексами
            char[] chars = word.toCharArray();
            // Перебираем каждый символ
            for (int i = 0; i < chars.length; i++) {
                // Сравнение текущего символа со всеми последующими
                for (int j = i + 1; j < chars.length; j++) {
                    // Если находится совпадение, то символы не уникальны
                    if (chars[i] == chars[j]) {
                        return false;
                    }
                }
            }
            // Если вложенный цикл не нашел совпадений, все символы уникальны
            return true;
        }
        // Метод ищет первое слово в массиве, состоящее из уникальных символов
        private static String findFirstWordWithUniqueChars(String[] words) {
            for (String word : words) {
                if (hasAllUniqueChars(word)) {
                    return word;
                }
            }
            return null; // Если ни одно слово не подошло
        }
    }
