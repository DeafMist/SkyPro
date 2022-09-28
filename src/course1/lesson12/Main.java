package course1.lesson12;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Pol", "Brull");
        Author author2 = new Author("Karmen", "Dallas");

        Book book1 = new Book("First book", author1, 1941);
        Book book2 = new Book("Second book", author2, 1945);

        System.out.println(book2);

        book2.setPublicationYear(1999);

        System.out.println(book2);
    }
}
