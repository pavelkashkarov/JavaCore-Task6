package src;

public class Main {
    public static void main(String[] args) {
        Administrator Vasya = new User("Вася", "администратор");
        Reader Petya = new User("Петя", "читатель");
        Supplier Anya = new User("Аня", "поставщик");
        Librarian Vova = new User("Вова", "библиотекарь");
        System.out.println(Vasya.overdueNotification(Petya));
        System.out.println(Vova.orderBook("Game of Thrones", Anya));
        System.out.println(Petya.returnBook("Смешарики"));
        System.out.println("Multiclass example: ");
        smartSupplier David = new smartSupplier("David");
        System.out.println(David.takeBook("Сказки для детей"));
        System.out.println(David.bringBook("Сказки для детей"));
    }
}