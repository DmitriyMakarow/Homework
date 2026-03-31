package homework4_1;

public class CardOperations {
    public static void main(String[] args) {

        /*
        создание трех объектов класса CreditCard у которых заданы
        номер счета и начальная сумма
         */
        CreditCard creditCardMir = new CreditCard();
        creditCardMir.accountNumber = "1234-5678-9024-5212";
        creditCardMir.balance = 237;

        CreditCard creditCardVisa = new CreditCard();
        creditCardVisa.accountNumber = "0987-6543-2135-4363";
        creditCardVisa.balance = 10000;

        CreditCard creditCardMaster = new CreditCard();
        creditCardMaster.accountNumber = "1253-2634-2637-5356";
        creditCardMaster.balance = 20000;

        // тестовый сценарий
        creditCardMir.deposit();
        creditCardVisa.deposit();
        creditCardMaster.withdraw();

        // вывод текущего состояния трех карт
        creditCardMir.cardInfo();
        creditCardVisa.cardInfo();
        creditCardMaster.cardInfo();
    }
}
