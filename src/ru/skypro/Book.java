package ru.skypro;

public class Book {
    private final String bookName;
    private final Author author;
    private int createYear;

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getCreateYear() {
        return createYear;
    }

    public void setCreateYear(int createYear) {
        this.createYear = createYear;
    }

    public Book(Author author, String bookName, int createYear) {
        this.author = author;
        this.bookName = bookName;
        this.createYear = createYear;
    }

    @Override
    public String toString() {
        return "Книга {" +
                "Название: " + bookName +
                ", Автор: " + author.getFirstMame() + " " + author.getSecondName() +
                ", Год издания: " + createYear +
                "}";
    }

}
