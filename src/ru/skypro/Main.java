package ru.skypro;


public class Main {

    public static void main(String[] args) {
	Book[] books = new Book[2];
    Author author1 = new Author("Лев", "Толстой");
    Book book_1 = new Book(author1,  "Война и Мир", 1863);
    books[0] = book_1;

    Author author2 = new Author("Айзек", "Азимов");
    Book book_2 = new Book(author2, "Основание",1942);
    books[1] = book_2;
    System.out.println(book_2);
    book_2.setCreateYear(1943);

//    System.out.println(book_1.getBookName() +", "+ book_1.getCreateYear() +", "+ book_1.getAuthor().getSecondName() +" "+ book_1.getAuthor().getFirstMame());
//    System.out.println(book_2.getBookName() +", "+ book_2.getCreateYear() +", "+ book_2.getAuthor().getSecondName() +" "+ book_2.getAuthor().getFirstMame());

        for (Book book : books) {
            System.out.println(book);
        }
    }

}
