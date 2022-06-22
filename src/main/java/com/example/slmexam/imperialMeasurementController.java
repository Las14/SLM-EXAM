package com.example.slmexam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class imperialMeasurementController {

    imperialMeasurements measurement = new imperialMeasurements();

    @RequestMapping ("/cm")
    public double cm(
            @RequestParam double a
    ) {
        return measurement.cm(a);
    }

    @RequestMapping ("/meter")
    public double meter(
            @RequestParam double a
    ) {
        return measurement.meter(a);
    }
}

