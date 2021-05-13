package com.example.crud.entity;

import javax.persistence.*;

@Entity
public class PartData {

    @Id
    @SequenceGenerator(
            name = "part_data_sequence",
            sequenceName = "part_data_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "part_data_sequence"
    )
    @Column(
            name = "id",
            updatable = false

    )
    private Long id;
    private String part_heading;

    @Lob
    @Column(name="part_description", length=512)
    private String part_description;

    private String part_id;

    public PartData(String part_heading, String part_description, String part_id) {
        this.part_heading = part_heading;
        this.part_description = part_description;
        this.part_id = part_id;
    }

    public PartData() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPart_heading() {
        return part_heading;
    }

    public void setPart_heading(String part_heading) {
        this.part_heading = part_heading;
    }

    public String getPart_description() {
        return part_description;
    }

    public void setPart_description(String part_description) {
        this.part_description = part_description;
    }

    public String getPart_id() {
        return part_id;
    }

    public void setPart_id(String part_id) {
        this.part_id = part_id;
    }


}
