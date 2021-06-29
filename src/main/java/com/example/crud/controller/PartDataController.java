package com.example.crud.controller;

import com.example.crud.classes.SuccessPartData;
import com.example.crud.classes.SuccessPartHeading;
import com.example.crud.entity.ScheduleData;
import com.example.crud.entity.PartData;
import com.example.crud.entity.ThirdScheduleData;
import com.example.crud.service.PartDataService;
import com.example.crud.service.impl.FirstSecondSecondScheduleServiceImpl;
import com.example.crud.service.impl.ThirdScheduleServiceIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PartDataController {

    @Autowired
    private PartDataService partDataService;

    @Autowired
    private FirstSecondSecondScheduleServiceImpl firstSecondSecondScheduleService;

    @Autowired
    private ThirdScheduleServiceIml thirdScheduleServiceIml;

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

    @GetMapping("/getPartDataDetails")
    public SuccessPartData fetchData(){

        return partDataService.getPartData1();
    }

    @GetMapping("/getPartHeadingDetails")
    public SuccessPartHeading fetchHeadingData(){

        return partDataService.getPartHeading();
    }

    /**
     * First & Second Schedule
     */

    @PostMapping("/addFirstSecondSchedule")
    public ResponseEntity<?> addFirstSchedule(@RequestBody ScheduleData scheduleData){
        return ResponseEntity.ok(firstSecondSecondScheduleService.saveSchedule(scheduleData));
    }

    @GetMapping("/firstSecondSchedule")
    public ModelAndView getFirstSecondSchedule(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("first_second_schedule");

        return modelAndView;

    }
    /**
     * Third Schedule
     */
    @PostMapping("/addThirdSchedule")
    public ResponseEntity<?> addThirdSchedule(@RequestBody ThirdScheduleData thirdScheduleData){
        return ResponseEntity.ok(thirdScheduleServiceIml.save(thirdScheduleData));
    }
    @GetMapping("/thirdSchedule")
    public ModelAndView getThirdSchedule(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("third_schedule");

        return modelAndView;
    }



}
