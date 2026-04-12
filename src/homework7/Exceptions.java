package homework7;

/*
Создать класс с как минимум 4 разными методами, в каждом методе добавить
проверку на исключительные ситуации, используя:
1. try- catch
2. try-catch, где catch будет несколько
3. try -catch, с использованием multi - catch
4. try-catch-finally
Продемонстрировать обработку исключительных ситуаций на примерах
 */

public class Exceptions {

    public static void main(String[] args) {
        try {
            int result = 1 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Произошла арифметическая ошибка");
        }
        System.out.println("Программа №1 все равно продолжила работать");
        System.out.println();
        Exception2();
    }

    public static void Exception2() {
        try {
            int[] num = {1, 3, 5};
            int a = 1 / 0;
            System.out.println(num[6]);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
        System.out.println("Программа №2 все равно продолжила работать");
        System.out.println();
        Exception3();
    }

    public static void Exception3() {
        try {
            int[] num = {1, 3, 5};
            int a = 90 / 0;
            System.out.println(a);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Произошла типовая ошибка");
        }
        System.out.println("Программа №3 все равно продолжила работать");
        System.out.println();
        Exception4();
    }


    public static void Exception4() {
        try {
            int[] num = {1, 2, 3};
            System.out.println(num[4]);
        } catch (Exception e) {
            System.out.println("Произошла типовая ошибка");
        } finally {
            System.out.println("finally выводится несмотря на то, что была ошибка");
        }
        System.out.println("Программа №4 все равно продолжила работать");
    }
}
