package homework4_2;

public class ATMOperations {
    public static void main(String[] args) {

        // задаем в банкомате начальное количество купюр
        ATM atm = new ATM(1, 1, 1);

        // добавляем купюры в банкомат
        atm.addMoney(3, 2, 3);

        // выводим текущую информацию после добавления купюр
        atm.displayInfo();

        // запрашиваем сумму для выдачи
        atm.withdraw(210);

        // выводим текущую информацию после снятия суммы
        atm.displayInfo();
    }
}
