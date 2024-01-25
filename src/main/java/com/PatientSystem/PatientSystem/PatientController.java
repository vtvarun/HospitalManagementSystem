package com.PatientSystem.PatientSystem;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @GetMapping("/about")
    public String sayHello(){
        return "Hello, Welcome to Max Hospital. We have been running a world class Hospital with advanced technologies that " +
                "can help you get the best treatment at effective rate and accuracy.";
    }

    @PostMapping("/addNewDoctor")
//    public String addNewDoctor(@RequestParam("hospitalId")){
//
//    }

    @GetMapping("/Bye")
    public String sayBye(){
        return "Thanks a lot for visiting, For more information. Please call us at 9899354760";
    }
}
