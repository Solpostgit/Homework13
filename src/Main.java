public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Lev", "Tolstoy");
        Author lermontov = new Author("Mihail", "Lermontov");
        Book warAndPeace = new Book("War and Peace", 1950, tolstoy);
        Book mciry = new Book("Mciry", 1955, lermontov);
        System.out.println("author1 = " + tolstoy.getName());
        System.out.println("author1 = " + tolstoy.getSurname());
        System.out.println("book1 = " + warAndPeace.getBookName());
        System.out.println("book1 = " + warAndPeace.getPublishingYear());
        warAndPeace.setPublishingYear(1951); //изменяем год публикации, через сеттер
        System.out.println("book1 = " + warAndPeace.getPublishingYear());
        System.out.println("author2 = " + lermontov.getName());
        System.out.println("author2 = " + lermontov.getSurname());
        System.out.println("book2 = " + mciry.getBookName());
        System.out.println("book2 = " + mciry.getPublishingYear());
    }
}