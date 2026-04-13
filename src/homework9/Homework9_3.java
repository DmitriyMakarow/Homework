package homework9;

/*
На вход поступает массив строк, верните Map<String, Boolean>, где каждая
отдельная строка является ключом, и ее значение равно true, если эта строка
встречается в массиве 2 или более раз. Пример:
wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"])→{"c": true}
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Homework9_3 {
    public static Map<String, Boolean> wordMultiple(String[] strings) {

        // Первая мапа для подсчета количества вхождений каждого слова
        Map<String, Integer> countMap = new HashMap<>();

        // Вторая мапа для сохранения порядка и хранения финального результата
        Map<String, Boolean> resultMap = new LinkedHashMap<>();

        // Проход по массиву для подсчета количества вхождений каждого слова
        for (String word : strings) {
            // getOrDefault возвращает текущее количество или 0, если слова еще нет в мапе
            int count = countMap.getOrDefault(word, 0) + 1;
            countMap.put(word, count);
        }

        // Заполнение итоговой мапы
        for (String word : strings) {
            // Если слово еще не добавлено в результат
            if (!resultMap.containsKey(word)) {
                // Значение true, если количество вхождений >= 2, иначе false
                boolean isMultiple = countMap.get(word) >= 2;
                resultMap.put(word, isMultiple);
            }
        }
        return resultMap;
    }

    public static void main(String[] args) {

        // Тестовые примеры из условия
        String[] test1 = {"a", "b", "a", "c", "b"};
        String[] test2 = {"c", "b", "a"};
        String[] test3 = {"c", "c", "c", "c"};

        System.out.println(wordMultiple(test1));
        System.out.println(wordMultiple(test2));
        System.out.println(wordMultiple(test3));
    }
}
