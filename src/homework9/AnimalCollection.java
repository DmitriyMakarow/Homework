package homework9;

/*
Создать класс, который будет хранить в себе коллекцию с названиями
животных. Реализовать методы удаления и добавления животных по
следующим правилам: добавляется всегда в начало коллекции, а удаляется
всегда из конца. Показать работу объекта этого класса в main методе другого
класса.
 */

import java.util.ArrayList;
import java.util.List;

public class AnimalCollection {
    private List<String> animals;

    public AnimalCollection() {
        this.animals = new ArrayList<>();
    }

    // метод добавления животных
    public void addAnimal(String animal) {
        // Вставка нового элемента на нулевую позицию, сдвигая все остальные элементы вправо
        animals.add(0, animal);
        System.out.println("Добавлено: " + animal);
    }

    // метод удаления животных
    public String removeAnimal() {
        if (animals.isEmpty()) {
            System.out.println("Коллекция пуста. Нечего удалять.");
            return null;
        }
        // Получение индекса последнего элемента
        int lastIndex = animals.size() - 1;
        // Удаление элемента по этому индексу
        String removedAnimal = animals.remove(lastIndex);
        System.out.println("Удалено: " + removedAnimal);
        return removedAnimal;
    }

    // Вывод текущего состояния коллекции
    public void showAnimals() {
        System.out.println("Текущий список животных: " + animals);
    }
}