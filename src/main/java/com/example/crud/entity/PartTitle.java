package com.example.crud.entity;

import javax.persistence.*;

@Entity(name = "part_title")
public class PartTitle {

    @Id
    @SequenceGenerator(
            name = "part_sequence",
            sequenceName = "part_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "part_sequence"
    )
    @Column(
            name = "id",
            updatable = false

    )
    private Long id;
    private String part_number;
    private String part_name;

    public PartTitle(String part_number, String part_name) {
        this.part_number = part_number;
        this.part_name = part_name;
    }

    public PartTitle() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPart_number() {
        return part_number;
    }

    public void setPart_number(String part_number) {
        this.part_number = part_number;
    }

    public String getPart_name() {
        return part_name;
    }

    public void setPart_name(String part_name) {
        this.part_name = part_name;
    }
}
