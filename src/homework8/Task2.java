package homework8;

/*Создать класс, который будет хранить в себе коллекцию с названиями
животных. Реализовать методы удаления и добавления животных по
следующим правилам: добавляется всегда в начало коллекции, а удаляется
всегда из конца. Показать работу объекта этого класса в main методе другого
класса.*/

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите животных через пробел:");
        String input = scanner.nextLine();
        String[] animals = input.split(" ");
        System.out.println("Создали коллекцию животных");
        Animals collection = new Animals(animals);
        System.out.println(collection);
        System.out.println("Какое животное вы хотите добавить?");
        String animal = scanner.nextLine();
        System.out.println("Добавили животное");
        collection.addAnimal(animal);
        System.out.println(collection);
        System.out.println("Удалили животное");
        collection.removeAnimal();
        System.out.println(collection);
    }
}
