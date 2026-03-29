package homework4.task1;

/* Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке. Напишите
программу, которая создает три объекта класса CreditCard у которых заданы
номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и
снимите с третьей. Выведите на экран текущее состояние всех трех карточек. */

public class Task1 {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard(1111, 100);
        CreditCard card2 = new CreditCard(2222, 200);
        CreditCard card3 = new CreditCard(3333, 300);

        card1.deposit(50);
        card2.deposit(100);
        card3.withdraw(70);
        card3.withdraw(500);

        card1.printCreditCard();
        card2.printCreditCard();
        card3.printCreditCard();
    }
}
