package com.example.crud.classes;

public class PartDetails {

    private String id;
    private String partDescription;
    private String partHeading;
    private String partId;

    public PartDetails(String id, String partDescription, String partHeading, String partId) {
        this.id = id;
        this.partDescription = partDescription;
        this.partHeading = partHeading;
        this.partId = partId;
    }

    public PartDetails() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartHeading() {
        return partHeading;
    }

    public void setPartHeading(String partHeading) {
        this.partHeading = partHeading;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId;
    }
}
