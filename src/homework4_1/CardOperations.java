package homework4_1;

public class CardOperations {
    public static void main(String[] args) {

        /*
        создание трех объектов класса CreditCard у которых заданы
        номер счета и начальная сумма
         */
        CreditCard creditCardMir = new CreditCard("1234-5678-9024-5212", 1000);
        CreditCard creditCardVisa = new CreditCard("0987-6543-2135-4363", 10000);
        CreditCard creditCardMaster = new CreditCard("1253-2634-2637-5356", 2000);

        // тестовый сценарий
        creditCardMir.deposit(11000); // Положить деньги на первую карту
        creditCardVisa.deposit(5000); // Положить деньги на вторую карту
        creditCardMaster.withdraw(1500); // Снять деньги с третьей карты

        // вывод текущего состояния трех карт
        creditCardMir.cardInfo();
        creditCardVisa.cardInfo();
        creditCardMaster.cardInfo();
    }
}
