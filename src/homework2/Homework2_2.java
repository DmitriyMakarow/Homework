package homework2;

import java.util.Scanner;

public class Homework2_2 {

/*
Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести
«Warm».
Если –5>= t >–20, то вывести «Normal». Если –20>= t, то вывести «Cold».
 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введете температуру на улице");
        System.out.println();
        int t = scanner.nextInt();

        if (t > -5) {
            System.out.println("Warm");
            System.out.println();
        } else if (-5 >= t && t > -20) {
            System.out.println("Normal");
            System.out.println();
        } else if (-20 >= t) {
            System.out.println("Cold");
            System.out.println();
        }
    }
}
