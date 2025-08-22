package Animals;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Апишка ");
        Cat cat1 = new Cat("Бэкенд ");
        Cat cat2 = new Cat("Таска ");

        dog1.run(300);
        dog1.swim(5);
        cat1.run(150);
        cat1.swim(3);
        cat2.run(300);
        cat2.swim(6);

        System.out.println(" Миска и кормление ");
        Plate plate = new Plate(20);
        Cat [] cats = { cat1, cat2 };

        for (Cat cat : cats) {
            cat.eat(plate, 15);
        }
        System.out.println(" Добавить еды в миску ");
        plate.addFood(20);

        for (Cat cat : cats){
            if (!cat.isFull()) {
                cat.eat(plate,15);
            }
        }
        System.out.println( " Итого имеем: ");
        System.out.println("Котов" + Cat.getCatCount());
        System.out.println("Собак" + Dog.getDogCount());
        System.out.println("Животных" + Animal.getAnimalCount());

    }
}
