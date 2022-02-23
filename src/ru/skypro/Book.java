package ru.skypro;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author);
    }

    @Override
    public String toString() {
        return "Книга {" +
                "Название: " + bookName +
                ", " + author +
                ", Год издания: " + createYear +
                "}";
    }

}
