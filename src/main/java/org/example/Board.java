package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
    private int id;
    private String title;
    private String content;
    private String regDate;

    public Board NewBoard(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.regDate = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
        return this;
    }

    public int getId() {return this.id;}
    public String getTitle() {return this.title;}
    public String getContent() {return this.content;}
    public String getRegDate() {return this.regDate;}
}
