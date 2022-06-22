package com.example.slmexam;

import org.springframework.web.bind.annotation.RestController;


public class imperialMeasurements {
    public double cm (double a){


        return a*2.54;
    }


    public double meter (double a){

            return a/1.094;
    }



}
