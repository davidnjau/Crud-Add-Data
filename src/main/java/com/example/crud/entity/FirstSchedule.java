package com.example.crud.entity;

import javax.persistence.*;

@Entity
public class FirstSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String part;

    @Lob
    @Column(name="content_description", length=512)
    private String content;

    public FirstSchedule(String part, String content) {
        this.part = part;
        this.content = content;
    }

    public FirstSchedule() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
