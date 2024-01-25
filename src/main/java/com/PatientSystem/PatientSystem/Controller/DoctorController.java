package com.PatientSystem.PatientSystem.Controller;

import com.PatientSystem.PatientSystem.Doctors;
import com.PatientSystem.PatientSystem.HospitalService.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController{

    @Autowired
    DoctorService doctorService;

    @GetMapping("/aboutDoctors")
    public String aboutDoctors(){
        return "We have trained and experienced doctors";
    }

    @PostMapping("/addNewDoctor")
    public String addNewDoctor(@RequestBody Doctors doctor){
        return doctorService.addNewDoctor(doctor);
    }

    @GetMapping("/getAllDoctors")
    public List<Doctors> getAllDoctors(){
        return doctorService.getAllDoctors();
    }


}
