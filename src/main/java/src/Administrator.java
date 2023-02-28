package src;

public interface Administrator {
    String findBook(String bookName);

    String giveBook(String bookName);

    String overdueNotification(Reader reader);
}
