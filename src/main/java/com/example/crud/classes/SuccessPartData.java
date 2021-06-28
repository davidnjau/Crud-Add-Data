package com.example.crud.classes;

import com.example.crud.entity.PartData;

import java.util.List;

public class SuccessPartData {

    private List<PartData> results;

    public SuccessPartData() {
    }

    public SuccessPartData(List<PartData> results) {
        this.results = results;
    }

    public List<PartData> getResults() {
        return results;
    }

    public void setResults(List<PartData> results) {
        this.results = results;
    }
}
