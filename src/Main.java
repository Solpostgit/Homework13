public class Main {
    public static void main(String[] args) {

        Author tolstoy = new Author("Lev", "Tolstoy");

        Author lermontov = new Author("Mihail", "Lermontov");

        Book warAndPeace = new Book("War and Peace", 1950, tolstoy);

        Book mciry = new Book("Mciry", 1955, lermontov);

        Book aNewBook = new Book("Mciry", 1955, lermontov);

        System.out.println(warAndPeace); // вывод toString
        System.out.println(mciry);

        System.out.println(warAndPeace.equals(aNewBook)); // Сравнение книг
        System.out.println(tolstoy.equals(lermontov)); // Сравнение авторов

        System.out.println(warAndPeace.hashCode()); // хэшКод книги
        System.out.println(mciry.hashCode()); // одинаковое содержание mciry и aNewBook
        System.out.println(aNewBook.hashCode()); // одинаковое содержание mciry и aNewBook

        System.out.println(tolstoy.hashCode()); // хэшКод Толстого
        System.out.println(lermontov.hashCode()); // хэшКод Лермонтова
    }
}