package homework2;

public class Homework2_4 {

/*
Необходимо, чтоб программа выводила на экран вот такую последовательность:
7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
 */

    public static void main(String[] args) {
        int a = 7;
        while (a <= 98) {
            System.out.print(a + " ");
            a += 7;
        }
    }
}
