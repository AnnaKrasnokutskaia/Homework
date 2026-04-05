package homework4.task2;

/* Создать класс, описывающий банкомат. Набор купюр, находящихся в
банкомате, должен задаваться тремя свойствами: количеством купюр
номиналом 20, 50 и 100. Сделать метод для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму денег, а
возвращает булевое значение - успешность выполнения операции. При
снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор с тремя параметрами
-количеством купюр каждого номинала */

public class Task2 {
    public static void main(String[] args) {
        ATM atm = new ATM(5, 3, 2);

        System.out.println("Начальное состояние банкомата:");
        atm.printInfo();
        System.out.println();

        System.out.println("Пополнение банкомата:");
        atm.deposit(2, 1, 1);
        atm.printInfo();
        System.out.println();

        System.out.println("Попытка снять 170:");
        boolean isOK = atm.getMoney(170);
        System.out.println("Успешно: " + isOK);
        atm.printInfo();
        System.out.println();

        System.out.println("Попытка снять 80:");
        isOK = atm.getMoney(80);
        System.out.println("Успешно: " + isOK);
        atm.printInfo();
        System.out.println();

        System.out.println("Попытка снять 75:");
        isOK = atm.getMoney(75);
        System.out.println("Успешно: " + isOK);
        atm.printInfo();
        System.out.println();

        System.out.println("Попытка снять 10000:");
        isOK = atm.getMoney(10000);
        System.out.println("Успешно: " + isOK);
        atm.printInfo();
        System.out.println();

        System.out.println("Попытка снять 40:");
        isOK = atm.getMoney(40);
        System.out.println("Успешно: " + isOK);
        atm.printInfo();

        System.out.println("Попытка снять 350:");
        isOK = atm.getMoney(350);
        System.out.println("Успешно: " + isOK);
        atm.printInfo();

    }
}
