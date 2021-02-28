package com.tmimi.architecture.models;

public class ToDo {
    private int id;
    private String title;
    private String content;
    private String creationDate;

    public ToDo() {
    }

    public ToDo(int id, String title, String content, String creationDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.creationDate = creationDate;
    }
    public ToDo(String title, String content, String creationDate) {
        this.title = title;
        this.content = content;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
