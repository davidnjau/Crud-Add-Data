package com.example.crud.controller;

import com.example.crud.classes.PartDetails;
import com.example.crud.entity.PartData;
import com.example.crud.service.PartDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
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
    public ModelAndView getPartData(Model model){

        List<PartData> partDataList = partDataService.getPartData();
        List<PartData> partDataArrayList = new ArrayList<>();


        for (int i = 0; i<partDataList.size(); i++){

            PartData partData = new PartData();

            Long id = partDataList.get(i).getId();
            String partHeading = partDataList.get(i).getPart_heading();
            String partDescription = partDataList.get(i).getPart_description();
            String partNumber = partDataList.get(i).getPart_id();

            if (partDescription.length() > 400){
                String partDescriptionFormat = partDescription.substring(0 , 400);
                partData.setPart_description(partDescriptionFormat + "... ");
            }else {
                partData.setPart_description(partDescription);
            }
            partData.setId(id);
            partData.setPart_heading(partHeading);
            partData.setPart_id(partNumber);

            partDataArrayList.add(partData);

        }

        model.addAttribute("partDataList", partDataArrayList);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("recorded");

        return modelAndView;
    }

//    @GetMapping("/getPartData")
//    public List<PartData> getPartData(Model model){
//
//        model.addAttribute("planningAct", Arrays.asList(
//
//                new PartDetails("1", "lg", "ger", "I"),
//                new PartDetails("2", "GJH", "FH", "II")
//
//        ));
//
//
//        return partDataService.getPartData();
//    }



}
