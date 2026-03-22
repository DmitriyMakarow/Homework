package homework1;

public class Homework1_6

/*
Написать программу которая будет менять местами значение целочисленных переменных.
Пример:
int a = 1;
int b = 2;
////код (ваше решение)
sout(a); //выведет 2
sout(b); //выведет 1
*/

{
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        a = a + b; // 1 + 2 = 3
        b = a - b; // 3 - 2 = 1
        a = a - b; // 3 - 1 = 2
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
