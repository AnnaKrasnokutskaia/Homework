package homework7;

import java.util.Scanner;

/* Ввести 3 строки с консоли. Найти слово, состоящее только из различных
символов. Если таких слов несколько, найти первое из них. */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            System.out.printf("Введите строку номер %d%n", i+1);
            strings[i] = scanner.nextLine();
        }
        boolean unique;
        //внешний цикл, идём по строкам
        for (int k = 0; k < strings.length; k++) {
            String str = strings[k];
            unique = true;
            //в одной строке сравниваем все символы
            for (int i = 0; i < str.length(); i++) {
                for (int j = i + 1; j < str.length(); j++) {
                    //если нашли повтор, переходим к следующей строке
                    if (str.charAt(i) == str.charAt(j)) {
                        unique = false;
                        break;
                    }
                }
                //вот тут я не поняла, но у меня не работало, и чатгпт мне сказал сюда тоже воткнуть бряк
                if (!unique) {
                    break;
                }
            }
            //выходим из внешнего цикла, когда нашли уникальную строку
            if (unique) {
                System.out.println("Найдено: " + str);
                break;
            }
        }
    }
}
