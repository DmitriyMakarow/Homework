package homework1;

public class Homework1_2

/*
В переменной n хранится двузначное число. Создайте программу,
вычисляющую и выводящую на экран сумму цифр n. Например: n = 26, в
результате мы должны получить 8 (2 + 6).
*/

{
    public static void main(String[] args) {
        int n = 26;
        int a = n / 10; // получаем первую цифру n
        int b = n % 10; // получаем вторую цифру n
        System.out.println(a + b); // выводим сумму цифр n
    }
}
