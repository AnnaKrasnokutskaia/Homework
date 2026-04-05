package homework4.task2;

/* Создать класс, описывающий банкомат. Набор купюр, находящихся в
банкомате, должен задаваться тремя свойствами: количеством купюр
номиналом 20, 50 и 100. Сделать метод для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму денег, а
возвращает булевое значение - успешность выполнения операции. При
снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор с тремя параметрами
-количеством купюр каждого номинала */

public class ATM {
    private int count20;
    private int count50;
    private int count100;

    public ATM(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    public void deposit(int add20, int add50, int add100) {
        count20 += add20;
        count50 += add50;
        count100 += add100;
    }

    public void printInfo(){
        System.out.println("В банкомате находится следующее количество купюр");
        System.out.println("100: " + count100);
        System.out.println("50: " + count50);
        System.out.println("20: " + count20);
    }

    public boolean getMoney (int amount) {
        int balance = count20 * 20 + count50 * 50 + count100 * 100;
        if (balance < amount) {
            System.out.println("Недостаточно средств для снятия");
            return false;
        } else {
            int originalAmount = amount;
            int use100 = Math.min(amount / 100, count100);
            amount -= use100 * 100;
            int use50 = Math.min(amount / 50, count50);
            amount -= use50 * 50;
            int use20 = Math.min(amount / 20, count20);
            amount -= use20 * 20;

            if (amount == 0) {
                count100 -= use100;
                count50 -= use50;
                count20 -= use20;

                System.out.println("Выдано:");
                System.out.println("100: " + use100);
                System.out.println("50: " + use50);
                System.out.println("20: " + use20);
                return true;
            } else {

                amount = originalAmount;
                use100 = Math.min(amount / 100, count100);
                amount -= use100 * 100;
                use50 = Math.min(amount / 100 * 2, count50);
                amount -= use50 * 50;
                // мы выдаём сотки по 50, если соток не хватило, но отдельно купюры по 50 в этом варианте не используем
                use20 = Math.min(amount / 20, count20);
                amount -= use20 * 20;
                if (amount == 0) {
                    count100 -= use100;
                    count50 -= use50;
                    count20 -= use20;

                    System.out.println("Выдано:");
                    System.out.println("100: " + use100);
                    System.out.println("50: " + use50);
                    System.out.println("20: " + use20);
                    return true;
                } else {
                    System.out.println("Выдать " + originalAmount + " рублей доступными купюрами невозможно");
                    return false;
                }
            }

        }
    }

}
