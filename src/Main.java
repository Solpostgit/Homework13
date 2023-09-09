public class Main {
    public static void main(String[] args) {

        Author tolstoy = new Author("Lev", "Tolstoy");

        Author lermontov = new Author("Mihail", "Lermontov");

        Book warAndPeace = new Book("War and Peace", 1950, tolstoy);

        Book mciry = new Book("MciryTYTY", 1955, lermontov);

        Book aNewBook = new Book("Mciry", 1955, lermontov);

        warAndPeace.setPublishingYear(1951); //изменяем год публикации, через сеттер

        System.out.println("book1 = " + warAndPeace.getPublishingYear());

        System.out.println(warAndPeace);
        System.out.println(mciry);

        System.out.println(warAndPeace.equals(aNewBook));

        System.out.println(warAndPeace.hashCode());
        System.out.println(mciry.hashCode());
        System.out.println(aNewBook.hashCode());
    }
}