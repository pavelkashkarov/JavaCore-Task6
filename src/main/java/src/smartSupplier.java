package src;

public class smartSupplier implements Reader, Supplier {

    public String name;

    public smartSupplier(String name) {
        this.name = name;
    }

    @Override
    public String takeBook(String bookName) {
        return ("Читатель " + this.name + " взял книгу " + bookName + " администратору ");
    }

    @Override
    public String returnBook(String bookName) {
        return ("Читатель " + this.name + " вернул книгу " + bookName + " администратору ");
    }

    @Override
    public String bringBook(String bookName) {
        return ("Поставщик книг " + this.name + " доставил книгу " + bookName + " в Библиотеку ");
    }
}
