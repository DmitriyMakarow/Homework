package homework9;

/*
Создать класс, который будет хранить в себе коллекцию с названиями
животных. Реализовать методы удаления и добавления животных по
следующим правилам: добавляется всегда в начало коллекции, а удаляется
всегда из конца. Показать работу объекта этого класса в main методе другого
класса.
 */

public class Zoo {
    public static void main(String[] args) {
        AnimalCollection zoo = new AnimalCollection();

        // Добавление животных
        zoo.addAnimal("Лев");
        zoo.addAnimal("Слон");
        zoo.addAnimal("Жираф");

        // Текущее состояние коллекции после добавления животных
        zoo.showAnimals();

        // Удаление двух животных
        zoo.removeAnimal();
        zoo.removeAnimal();

        // Текущее состояние коллекции после удаления двух животных
        zoo.showAnimals();

        // Удаление последнего животного
        zoo.removeAnimal();

        // Удаление из пустой коллекции
        zoo.removeAnimal();

        // Демонстрация того, что коллекция пуста
        zoo.showAnimals();
    }
}
