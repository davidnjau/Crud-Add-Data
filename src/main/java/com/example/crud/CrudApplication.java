package com.example.crud;

import com.example.crud.entity.PartTitle;
import com.example.crud.repository.PartTitleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PartTitleRepository partTitleRepository){
        return args -> {

            List<String> partNumberList = Arrays.asList("I", "II","III","IV","V","VI","VII","VIII");
            List<String> partNameList = Arrays.asList(
                    "PRELIMINARY",
                    "PHYSICAL AND LAND USE PLANNING INSTITUTIONS",
                    "TYPES OF PHYSICAL AND LAND USE DEVELOPMENT PLANS",
                    "DEVELOPMENT CONTROL",
                    "ENFORCEMENT",
                    "PHYSICAL AND LAND USE PLANNING LIAISON COMMITTEES",
                    "PROVISIONS ON DELEGATED POWERS",
                    "MISCELLANEOUS PROVISIONS");

            for (int i = 0; i< partNameList.size(); i++){

                String partNo = partNumberList.get(i);
                String partTitleName = partNameList.get(i);
                PartTitle partTitle = new PartTitle(partNo, partTitleName);
                partTitleRepository.save(partTitle);
            }

        };
    }

}
