/* 1. Создать класс "Товар" с полями: название, дата производства, производитель,
 страна происхождения,
цена, состояние бронирования покупателем.
Конструктор класса должен заполнять эти поля при создании объекта.
Внутри класса «Товар» написать метод, который выводит информацию об объекте в консоль.
2. Создать массив из 5 товаров. */


import java.util.Date;

public class Goods {

    String nameGoods;
    String dateProduction;
    String manufacturer;
    String countryOfOrigin;
    int price;
    boolean statusBookingBuyer;

    public Goods(String nameGoods, String dateProduction, String manufacturer, String countryOfOrigin, int price,
                 boolean statusBookingBuyer) {
        this.nameGoods = nameGoods;
        this.dateProduction = dateProduction;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.statusBookingBuyer = statusBookingBuyer;
    }

    public void printGoodsInfo() {
        System.out.println("Информация о товаре:");
        System.out.println("Название: " + nameGoods);
        System.out.println("Дата производства: " + dateProduction);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price);
        System.out.println("Забронирован: " + statusBookingBuyer);

    }

    public static void main(String[] args) {
        Goods nameGoodsOne = new Goods("Клюква", "01.01.2024", "РУП", "Беларусь", 25, true);

        nameGoodsOne.printGoodsInfo();
        {
            Goods[] productArr = new Goods[5];
            {
            }
            productArr[0] = new Goods("Мех", "01.01.2025", "ООО", "Рогачев", 15, false);
            productArr[1] = new Goods("Панда", "11.01.2023", "ОАО", "Минск", 1500, true);
            productArr[2] = new Goods("Цветы", "19.08.2025", "ЗАО", "Гродно", 30, true);
            productArr[3] = new Goods("Открытка", "01.08.2025", "ИП", "Заславль", 2, false);
            productArr[4] = new Goods("Свечи", "15.08.2025", "ЧУП", "Гродно", 6, true);

            System.out.println("Информация о товарах в массиве:");
            for (int i = 0; i < productArr.length; i++) {
                System.out.println("Товар #" + (i + 1) + ":");
                productArr[i].printGoodsInfo();
                System.out.println();
            }
        }
    }
}