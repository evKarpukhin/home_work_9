package ru.skypro;

public class Author {
    private final String firstMame;
    private final String secondName;

    public Author(String firstMame, String secondName) {
        this.firstMame = firstMame;
        this.secondName = secondName;
    }

    public String getFirstMame() {
        return firstMame;
    }

    public String getSecondName() {
        return secondName;
    }

}
