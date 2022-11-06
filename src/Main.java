
public class Main {
    public static void main(String[] args) {
        Animals animal = new Animals();
        animal.animals.add("Tigger");
        animal.animals.add("Dog");
        animal.animals.add("Cat");
        System.out.println(animal.animals);
        animal.addAnimals("Rat");
        animal.deleteAnimals();
        animal.deleteAnimals();
        System.out.println(animal.animals);
    }
}