package homework4_2;

import java.util.Scanner;

public class ATM {

    /*
    Создать класс, описывающий банкомат. Набор купюр, находящихся в
банкомате, должен задаваться тремя свойствами: количеством купюр
номиналом 20, 50 и 100. Сделать метод для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму денег, а
возвращает булевое значение - успешность выполнения операции. При
снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор с тремя параметрами
-количеством купюр каждого номинала
     */

    int count20;
    int count50;
    int count100;

    // Конструктор с тремя параметрами
    public ATM(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    // метод для добавления денег в банкомат
    public void addMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(("Введите количество купюр с номиналом 20, которые вы хотите внести в банкомат"));
        int add20 = scanner.nextInt();
        this.count20 += add20;
        System.out.println("Введите количество купюр с номиналом 50, которые вы хотите внести в банкомат");
        int add50 = scanner.nextInt();
        this.count50 += add50;
        System.out.println("Введите количество купюр с номиналом 100, которые вы хотите внести в банкомат");
        int add100 = scanner.nextInt();
        this.count100 += add100;
        System.out.println("Купюры успешно внесены: " + count20 + "x20 " + count50 + "x50 " + count100 + "x100 ");
        System.out.println();
    }

    // Метод для снятия денег
    public boolean withdraw() {
        System.out.println();
        System.out.println("Введите сумму, которую желаете снять");
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        // Проверка на корректность суммы (кратность 10)
        if (sum % 10 != 0 || sum <= 0) {
            System.out.println("Неверная сумма для снятия.");
            System.out.println();
            return false;
        }

        // Копируем текущее состояние для попытки выдачи
        int temp20 = count20;
        int temp50 = count50;
        int temp100 = count100;

        int need20 = 0, need50 = 0, need100 = 0;
        int remaining = sum;

        // Сначала выдача самых крупных купюр
        need100 = Math.min(remaining / 100, temp100);
        remaining -= need100 * 100;

        need50 = Math.min(remaining / 50, temp50);
        remaining -= need50 * 50;

        need20 = Math.min(remaining / 20, temp20);
        remaining -= need20 * 20;

        // Если остаток не ноль — не удалось выдать сумму имеющимися купюрами
        if (remaining != 0) {
            System.out.println("Не удалось выдать сумму " + sum + ". Недостаточно купюр нужного номинала.");
            System.out.println();
            return false;
        }

        // Если удалось — обновляем количество купюр
        count20 -= need20;
        count50 -= need50;
        count100 -= need100;

        // Выводим информацию о выдаче
        System.out.println("Выдача суммы " + sum + ":");
        if (need100 > 0) System.out.println(need100 + " купюр по 100");
        if (need50 > 0) System.out.println(need50 + " купюр по 50");
        if (need20 > 0) System.out.println(need20 + " купюр по 20");
        System.out.println();
        return true;
    }

    // Метод для вывода текущего состояния банкомата
    public void displayInfo() {
        System.out.println("Текущее состояние банкомата:");
        System.out.println("Купюр по 20: " + count20);
        System.out.println("Купюр по 50: " + count50);
        System.out.println("Купюр по 100: " + count100);
    }
}
