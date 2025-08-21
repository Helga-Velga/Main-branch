/*3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
времени их работы и стоимости. */

import java.util.ArrayList;
import java.util.List;

public class Park {

    public Park(String центральныйПарк, String s) {
    }

    public class Attraction {
        private String name;
        private String time;
        private double cost;

        public Attraction(String name, String time, double cost) {
            this.name = name;
            this.time = time;
            this.cost = cost;
        }

        public void displayAttractionInfo() {
            System.out.println("Название: " + name + ", Время: " + time + ", Стоимость: " + cost);
        }
    }

    private List<Attraction> rides = new ArrayList<>(); // Список аттракционов в парке

    
    public void addAttraction(String name, String time, double cost) {
        Attraction newRide = new Attraction(name, time, cost);
        rides.add(newRide);
    }

    public void displayParkInfo() {
        System.out.println("Аттракционы:");
        for (Attraction ride : rides) {
            ride.displayAttractionInfo();
        }
    }

    public static void main(String[] args) {
        Park myPark = new Park("Гомельский парк", "ул. Пролетарская, 21");
        myPark.addAttraction("Вальс", "10:00-22:00", 12.5);
        myPark.addAttraction("Колесо обозрения", "10:00-20:00", 15.0);
        myPark.addAttraction("Паровозик", "10:00-21:00", 10.5);

        myPark.displayParkInfo();
    }
}