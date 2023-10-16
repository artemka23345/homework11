public class Main {
    public static void main(String[] args) {
        Author author = new Author("Юваль Ной"," Харари");
        Author author2 = new Author("Джордж", "Оруэлл");
        Book book = new Book("Sapiens. Краткая история человечества",2014,author);
        Book book2 = new Book("1984",1949,author2);

        System.out.println(book);
        System.out.println(book2);
        book2.setYearPublication(2023);
        System.out.println(book2);


    }
}
