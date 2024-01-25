package com.PatientSystem.PatientSystem.HospitalService;

import com.PatientSystem.PatientSystem.Doctors;
import com.PatientSystem.PatientSystem.Hospital;
import com.PatientSystem.PatientSystem.Repository.DoctorRepository;
import com.PatientSystem.PatientSystem.Repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;


    public String addNewDoctor(Doctors doctor){
        doctorRepository.addNewDoctor(doctor);
        return "Added Successfully";
    }

    public List<Doctors> getAllDoctors(){
        List<Doctors> doctors = new ArrayList<>();

        for(int doct : doctorRepository.doctorHashMap.keySet()){
            doctors.add(doctorRepository.doctorHashMap.get(doct));
        }

        return doctors;
    }

//    public String addDoctorToHospital(int hospitalId){
//        //get a hospital first
//        Hospital hospital = hospitalHashMap.get(hospitalId);
//        return "Added to the Hospital";
//    }
}
