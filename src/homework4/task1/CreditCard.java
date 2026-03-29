package homework4.task1;

/* Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке. Напишите
программу, которая создает три объекта класса CreditCard у которых заданы
номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и
снимите с третьей. Выведите на экран текущее состояние всех трех карточек. */

public class CreditCard {
    private long number;
    private double balance;

    public CreditCard(long number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств для снятия " + amount + " рублей, ваш баланс " + balance + " рублей");
        }
    }

    public void printCreditCard() {
        System.out.println("Номер счета: " + number);
        System.out.println("Баланс: " + balance);
    }
}
