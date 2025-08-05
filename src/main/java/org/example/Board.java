package org.example;

public class Board {
    private int id;
    private String title;
    private String content;

    public Board NewBoard(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
        return this;
    }
}
