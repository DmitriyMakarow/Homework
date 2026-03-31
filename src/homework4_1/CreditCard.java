package homework4_1;

import java.util.Scanner;

public class CreditCard {

    /*
    Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке. Напишите
программу, которая создает три объекта класса CreditCard у которых заданы
номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и
снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
     */

    String accountNumber; // номер счета
    double balance; // текущая сумма на счете
    int deposit; // пополнение карты
    int withdraw; // снятие с карты
    Scanner scanner = new Scanner(System.in);

    // метод начисления суммы на кредитную карту
    public void deposit() {
        System.out.println("Введите сумму, на которую хотите пополнить баланс счета: " + accountNumber);
        deposit = scanner.nextInt(); // ввод суммы пополнения пользователем
        if (deposit > 0) {
            balance += deposit; // текущий баланс счета после пополнения
        }
    }

    // метод снятия суммы с кредитной карты
    public void withdraw() {
        System.out.println("Введите сумму, которую желаете снять со счета: " + accountNumber);
        while (true) {
            if (scanner.hasNextInt()) {
                withdraw = scanner.nextInt();
                if (withdraw < balance && withdraw > 0) { // проверка, что сумма снятия меньше баланса и больше 0
                    balance -= withdraw;
                    break; // Корректная сумма, выводим из цикла
                } else {
                    System.out.println("Недостаточно средств или неверная сумма. Введите корректную сумму.");
                    System.out.println();
                }
            }
        }
    }

    // текущая информация о карте
    public void cardInfo() {
        System.out.println("Номер счета: " + accountNumber + " Текущий баланс: " + balance + " руб.");
    }
}
