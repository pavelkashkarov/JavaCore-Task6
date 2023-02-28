package src;

public class User implements Reader, Supplier, Librarian, Administrator {
    public String name;
    public String post;

    public User(String name, String post) {
        this.name = name;
        this.post = post;
    }

    @Override
    public String findBook(String bookName) {
        return ("Администратор " + this.name + " ищет книгу " + bookName);
    }

    @Override
    public String giveBook(String bookName) {
        return ("Администратор " + this.name + " выдает книгу " + bookName);
    }

    @Override
    public String overdueNotification(Reader reader) {
        return ("Администратор " + this.name + " предупреждает " + reader + ", что книга просрочена");
    }

    @Override
    public String orderBook(String bookName, Supplier supplier) {
        return ("Библиотекарь " + this.name + " заказал книгу " + bookName + " у поставщика " + supplier);
    }

    @Override
    public String takeBook(String bookName) {
        return ("Читатель " + this.name + " вернул книгу " + bookName + " администратору ");
    }

    @Override
    public String returnBook(String bookName) {
        return ("Читатель " + this.name + " вернул книгу " + bookName);
    }

    @Override
    public String bringBook(String bookName) {
        return (" Поставщик книг " + this.name + " доставил книгу " + bookName + " в Библиотеку ");
    }

    public String toString() {
        return this.name;
    }
}
