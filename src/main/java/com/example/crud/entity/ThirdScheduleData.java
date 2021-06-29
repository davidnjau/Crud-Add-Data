package com.example.crud.entity;

import javax.persistence.*;

@Entity
public class ThirdScheduleData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title;

    @Lob
    @Column(name="content_description", length=512)
    private String content;

    public ThirdScheduleData(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public ThirdScheduleData() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
}
