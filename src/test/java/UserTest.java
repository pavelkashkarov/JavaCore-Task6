import org.junit.jupiter.api.Assertions;
import src.*;

public class UserTest {
    @org.junit.jupiter.api.Test
    public void  findBook() {
        // given:
        String name = "Виктор", bookName = "Война и мир",  post = "администратор";
        Administrator Victor = new User(name, post);
        String expected = "Администратор Виктор ищет книгу Война и мир";
        // when:
        String actual = Victor.findBook(bookName);
        // then:
        Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void  giveBook() {
        // given:
        String name = "Виктор", bookName = "Война и мир",  post = "администратор";
        Administrator Victor = new User(name, post);
        String expected = "Администратор Виктор выдает книгу Война и мир";
        // when:
        String actual = Victor.giveBook(bookName);
        // then:
        Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void  overdueNotification() {
        // given:
        String name = "Виктор", post = "администратор";
        Reader reader = new User("Петя", "читатель");
        Administrator Victor = new User(name, post);
        String expected = "Администратор Виктор предупреждает Петя, что книга просрочена";
        // when:
        String actual = Victor.overdueNotification(reader);
        // then:
        Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void  orderBook() {
        // given:
        String name = "Виктор", bookName = "Война и мир",  post = "библиотекарь";
        Librarian Victor = new User(name, post);
        Supplier supplier = new User("Петя", "поставщик");
        String expected = "Библиотекарь Виктор заказал книгу Война и мир у поставщика Петя";
        // when:
        String actual = Victor.orderBook(bookName, supplier);
        // then:
        Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void  takeBook() {
        // given:
        String name = "Виктор", bookName = "Война и мир",  post = "читатель";
        Reader Victor = new User(name, post);
        String expected = "Читатель Виктор вернул книгу Война и мир администратору ";
        // when:
        String actual = Victor.takeBook(bookName);
        // then:
        Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void  returnBook() {
        // given:
        String name = "Виктор", bookName = "Война и мир",  post = "читатель";
        Reader Victor = new User(name, post);
        String expected = "Читатель Виктор вернул книгу Война и мир";
        // when:
        String actual = Victor.returnBook(bookName);
        // then:
        Assertions.assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    public void  bringBook() {
        // given:
        String name = "Виктор", bookName = "Война и мир",  post = "поставщик";
        Supplier Victor = new User(name, post);
        String expected = " Поставщик книг Виктор доставил книгу Война и мир в Библиотеку ";
        // when:
        String actual = Victor.bringBook(bookName);
        // then:
        Assertions.assertEquals(expected, actual);
    }
}
