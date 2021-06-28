package com.example.crud.classes;

import com.example.crud.entity.PartData;
import com.example.crud.entity.PartTitle;

import java.util.List;

public class SuccessPartHeading {

    private List<PartTitle> results;

    public SuccessPartHeading(List<PartTitle> results) {
        this.results = results;
    }

    public SuccessPartHeading() {
    }

    public List<PartTitle> getResults() {
        return results;
    }

    public void setResults(List<PartTitle> results) {
        this.results = results;
    }
}
