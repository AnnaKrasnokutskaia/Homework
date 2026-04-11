package homework8;

/*Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран.
При решении использовать коллекции.*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел через запятую (например: 1, 2, 3, 4)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        /* вот тут условие размытое, потому что в примере ввод через запятую и
        пробел, а в условии ввод не оговаривается как, но я хз, как сделать, чтобы
        работало с любым разделителем, поэтому попросила вводить через запятую,
        а пробелы убрала*/
        Set <Integer> numbers = new HashSet<>();
        for (String part : parts) {
            numbers.add(Integer.parseInt(part.trim()));
        }
        System.out.println(numbers);
    }
}
