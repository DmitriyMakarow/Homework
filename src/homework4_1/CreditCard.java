package homework4_1;

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

    //конструктор для инициализации номера счета и начальной суммы
    public CreditCard(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // метод начисления суммы на кредитную карту
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;// текущий баланс счета после пополнения
        }
    }

    // метод снятия суммы с кредитной карты
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) { // проверка, что сумма снятия меньше баланса и больше 0
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств или неверная сумма для снятия.");
            System.out.println();
        }
    }

    // текущая информация о карте
    public void cardInfo() {
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Текущая сумма: " + balance);
        System.out.println();
    }
}
