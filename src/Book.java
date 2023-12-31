import java.util.Objects;

public class Book {
    private String bookTitle;
    private int yearPublication;
    private Author author;

    @Override
    public String toString() {
        return "Название книги: " + bookTitle + ", Год публикации: " + yearPublication + ", Автор: " + author;
    }

    public Book(String bookTitle, int yearPublication, Author author) {
        this.bookTitle = bookTitle;
        this.yearPublication = yearPublication;
        this.author = author;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, yearPublication, author);
    }
}
