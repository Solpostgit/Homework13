import java.util.Objects;

public class Book {
    private String bookName;
    private int publishingYear;
    Author author;

    public Book(String bookName, int publishingYear, Author author) {
        this.bookName = bookName;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    Author getAuthor() {
        return this.author;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String toString() {
        return this.author + " Название " + this.bookName + " Год издания " + this.publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, publishingYear, author);
    }
}