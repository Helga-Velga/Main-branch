package Animals;

public class Plate {
    private int food;

    public Plate (int food){
        this.food = Math.max (food, 0);
    }
    public boolean decreaseFood(int amount) {
        if (amount <= food){
            food -= amount;
            return true;
        }
        return false;
    }
    public void addFood (int amount){
        if (amount > 0) {
            food +=amount;
            System.out.println(" В миску добавлено " + amount + " еды. Остаток: " +food);
        }
    }
    public int getFood(){
    return food;
    }
}
