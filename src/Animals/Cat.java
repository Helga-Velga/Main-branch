package Animals;

class Cat extends Animal {
    private static int catCount = 0;
    private static final int MAX_RUN_DISTANCE = 200;
    private boolean isFull = false; // Сытость кота

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробежал " + distance + " м");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м. Максимальная дистанция: " + MAX_RUN_DISTANCE + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public boolean isFull() {
        return isFull;
    }

    public void eat(Plate bowl, int foodAmount) {
        if (bowl.decreaseFood(foodAmount)) {
            isFull = true;
            System.out.println(name + " покушал. ");
        } else {
            System.out.println(name + " не стал есть - мало еды. ");
        }
    }

    public static int getCatCount() {
        return catCount;

    }
}


