package NumberPhone;

public class Main {
        public static void main(String[] args) {
        NumberPhone phoneBook = new NumberPhone(); // Добавляем записи
        phoneBook.add("Джонни", "111-111");
        phoneBook.add("Гэнгста", "222-222");
        phoneBook.add("Джонни", "333-333"); // Ещё один Иванов // Получаем телефоны по фамилии

        System.out.println("Телефоны Джонни:");
        for (String number : phoneBook.get("Джонни")) {
            System.out.println(number); }
    }}
