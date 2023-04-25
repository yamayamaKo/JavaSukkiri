package _11;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("すっきりわかるJava入門", 3000, "green", "UN1111");
        Computer computer = new Computer("macbook", 140000, "spacecraft", "apple");

        System.out.println(book.getIsbn());
        System.out.println(book.getName());
        System.out.println(computer.getName());
        System.out.println(computer.getMakerName());

        System.out.println(book.getWeight());
        book.setWeight(100);
        System.out.println(book.getWeight());
        System.out.println(computer.getWeight());
        computer.setWeight(50000);
        System.out.println(computer.getWeight());
    }
}
