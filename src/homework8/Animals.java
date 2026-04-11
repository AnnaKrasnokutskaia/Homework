package homework8;

/*Создать класс, который будет хранить в себе коллекцию с названиями
животных. Реализовать методы удаления и добавления животных по
следующим правилам: добавляется всегда в начало коллекции, а удаляется
всегда из конца. Показать работу объекта этого класса в main методе другого
класса.*/

import java.util.ArrayDeque;
import java.util.Deque;

public class Animals {
    private Deque<String> animals = new ArrayDeque<>();
    /*в очереди добавляется в конец, удаляется из начала, а в условии наоборот
    значит, не просто очередь. Можно было через ещё через двусвязный список*/

    public Animals(String[] animalsArray) {
        for (String animal : animalsArray) {
            animals.addLast(animal);
        }
    }

    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }

    public void removeAnimal() {
        if (!animals.isEmpty()) {
            animals.removeLast();
        } else {
            System.out.println("Животных и так нет");
        }
    }

    @Override
    public String toString() {
        return animals.toString();
    }
}
