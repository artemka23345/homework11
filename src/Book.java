public class Book {
    private String bookTitle;
    private int yearPublication;
    private Author author;

    @Override
    public String toString() {
        return
                "Название книги: " + bookTitle +
                ", Год публикации: " + yearPublication +
                ", Автор: " + author;
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
}
