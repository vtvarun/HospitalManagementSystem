package com.PatientSystem.PatientSystem.Controller;

import com.PatientSystem.PatientSystem.Doctors;
import com.PatientSystem.PatientSystem.Hospital;
import com.PatientSystem.PatientSystem.HospitalService.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    HospitalService hospitalService;

    @GetMapping("/aboutHospital")
    public String hello(){
        return "Hello From Hospital";
    }

//    @PostMapping("/addNewHospital")
//    public String addNewHospital(@RequestParam("hospitalID") int id, @RequestParam("numberOfBeds") int beds, @RequestParam("hospitalName") String name,
//                                 @RequestParam("numberOfOxygenCylinders") int num, @RequestParam("contactNumber") long contact,
//                                 @RequestParam("email") String email){
//        return hospitalService.addNewHospital(id,beds,name,num,contact,email);
//    }

    @PostMapping("/addNewHospital")
    public String addNewHospital(@RequestBody Hospital obj){
        return hospitalService.addNewHospital(obj);
    }

    @GetMapping("/allHospitals")
    public List<Hospital> getAllHospitals(){
        return hospitalService.getAllHospitals();
    }

    @GetMapping("/getDoctors")
    public List<Doctors> getDoctors(@RequestParam int hospitalId){
        return hospitalService.getAllDoctors(hospitalId);
    }

    @GetMapping("/addDoctorsToHospital")
    public String addDoctorTOHospital(@RequestParam int hospitalId, @RequestParam int doctorsId){
        return hospitalService.addDoctorToHospital(hospitalId,doctorsId);
    }
}
