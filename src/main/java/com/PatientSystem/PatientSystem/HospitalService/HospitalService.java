package com.PatientSystem.PatientSystem.HospitalService;

import com.PatientSystem.PatientSystem.Doctors;
import com.PatientSystem.PatientSystem.Hospital;
import com.PatientSystem.PatientSystem.Repository.DoctorRepository;
import com.PatientSystem.PatientSystem.Repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class HospitalService {

    @Autowired
    HospitalRepository hospitalRepository;

    @Autowired
    DoctorRepository doctorRepository;

    public List<Doctors> getAllDoctors(int hospitalId){
        return hospitalRepository.getAllDoctors(hospitalId);
    }

    public String addDoctorToHospital(int hospitalId, int doctorId){
        Doctors doctor = doctorRepository.doctorHashMap.get(doctorId);
        Hospital hospital = hospitalRepository.hospitalHashMap.get(hospitalId);
        hospital.getDoctorsList().add(doctor);
        return "ADDED SUCCESSFULLY";
    }

    public String addNewHospital(Hospital hospital){

        List<Hospital> list = hospitalRepository.getAllHospitals();

        for(int i=0 ; i < list.size() ; i++){
            if(list.get(i).getHospitalID() == hospital.getHospitalID()){
                return "You are trying to add"+hospital.getHospitalName()+" but this is already added as "+list.get(i).getHospitalName();
            }
        }

        hospitalRepository.addToDataBase(hospital.getHospitalID(),hospital);

        return "Added Successfully";
    }

    public List<Hospital> getAllHospitals(){
        return hospitalRepository.getAllHospitals();
    }

}
