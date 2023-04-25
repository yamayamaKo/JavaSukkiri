package _11;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("すっきりわかるJava入門", 3000, "green", "UN1111");
        Computer computer = new Computer("macbook", 140000, "spacecraft", "apple");

        System.out.println(book.getIsbn());
        System.out.println(computer.getMakerName());
    }
}
