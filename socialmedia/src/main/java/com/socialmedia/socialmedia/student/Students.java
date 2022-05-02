package com.socialmedia.socialmedia.student;

public class Students {
    private int id;
    private String name;
    private String subject;
    public Students(){

    }

    public Students(int id, String name, String subject) {
        id = id;
        name = name;
        subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
