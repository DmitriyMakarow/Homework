package homework4_2;

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
    public void addMoney(int add20, int add50, int add100) {
        this.count20 += add20;
        this.count50 += add50;
        this.count100 += add100;
        System.out.println("Купюры успешно внесены: " + add20 + "x20 " + add50 + "x50 " + add100 + "x100 ");
        System.out.println();
    }

    // Метод для снятия денег
    public boolean withdraw(int sum) {
        // Проверка суммы
        if (sum < 0) {
            System.out.println("Неверная сумма для снятия.");
            System.out.println();
            return false;
        }
        if (sum == 0) {
            System.out.println("Выдача суммы 0: купюры не выдаются.");
            return true;
        }

        // Проверка кратности минимальному номиналу (НОД для 20,50,100 = 10)
        if (sum % 10 != 0) {
            System.out.println("Сумма должна быть кратна 10.");
            return false;
        }

        // Проверка общей суммы в банкомате
        int totalAvailable = count20 * 20 + count50 * 50 + count100 * 100;
        if (sum > totalAvailable) {
            System.out.println("Недостаточно денег в банкомате для выдачи суммы " + sum);
            return false;
        }
        boolean success = false;

        // Перебираем количество купюр по 100 от max до 0
        for (int n100 = Math.min(sum / 100, count100); n100 >= 0; n100--) {
            int remainingAfter100 = sum - n100 * 100;

            // Для каждого варианта по 100 перебираем количество купюр по 50
            for (int n50 = Math.min(remainingAfter100 / 50, count50); n50 >= 0; n50--) {
                int remainingAfter50 = remainingAfter100 - n50 * 50;

                // Проверяем, можно ли добрать остаток купюрами по 20
                if (remainingAfter50 % 20 == 0 && remainingAfter50 / 20 <= count20) {
                    // Решение найдено
                    int n20 = remainingAfter50 / 20;

                    // Обновляем состояние банкомата
                    count20 -= n20;
                    count50 -= n50;
                    count100 -= n100;

                    // Вывод информации
                    System.out.println("Выдача суммы " + sum + ":");
                    if (n20 > 0) System.out.println(n20 + " купюр по 20 ");
                    if (n50 > 0) System.out.println(n50 + " купюр по 50 ");
                    if (n100 > 0) System.out.println(n100 + " купюр по 100 ");

                    success = true;
                    break; // Выход из внутреннего цикла
                }
            }
            if (success) break; // Выход из внешнего цикла
        }
        if (!success) {
            System.out.println("Не удалось выдать сумму " + sum + ". Недостаточно купюр нужного номинала.");
            System.out.println();
            return false;
        }
        System.out.println();
        return true;
    }

    // Метод для вывода текущего состояния банкомата
    public void displayInfo() {
        System.out.println("Текущее состояние банкомата:");
        System.out.println("Купюр по 20: " + count20);
        System.out.println("Купюр по 50: " + count50);
        System.out.println("Купюр по 100: " + count100);
        System.out.println();
    }
}
