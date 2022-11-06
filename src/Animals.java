import java.util.LinkedList;
import java.util.Scanner;

public class Animals {
    LinkedList<String> animals = new LinkedList<>();

    void addAnimals(String animal) {
        animals.addLast(animal);
        System.out.println("Вы добавили " + animal);
    }

    void deleteAnimals() {
        try {
            animals.removeFirst();
        } catch (Exception e) {
            System.out.println("Неполучилось провести операцию");
        }
    }
}

