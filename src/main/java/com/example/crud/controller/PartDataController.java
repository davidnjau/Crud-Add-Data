package com.example.crud.controller;

import com.example.crud.classes.PartDetails;
import com.example.crud.entity.PartData;
import com.example.crud.service.PartDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class PartDataController {

    @Autowired
    private PartDataService partDataService;

    @PostMapping("/addPartData")
    public ResponseEntity<?> addPartData(@RequestBody PartData partData){
        return ResponseEntity.ok(partDataService.saveProduct(partData));
    }

    @GetMapping("/getPartData")
    public List<PartData> getPartData(Model model){

        model.addAttribute("planningAct", Arrays.asList(

                new PartDetails("1", "lg", "ger", "I"),
                new PartDetails("2", "GJH", "FH", "II")

        ));


        return partDataService.getPartData();
    }



}
