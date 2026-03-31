package homework4_2;

public class ATMOperations {
    public static void main(String[] args) {
        ATM atm = new ATM(0,0,0);
        atm.addMoney();
        atm.displayInfo();
        atm.withdraw();
        atm.displayInfo();
    }
}
