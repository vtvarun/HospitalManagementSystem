package com.PatientSystem.PatientSystem.Repository;

import com.PatientSystem.PatientSystem.Doctors;
import com.PatientSystem.PatientSystem.Hospital;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.HashMap;

@Repository
public class HospitalRepository {
    public HashMap<Integer, Hospital> hospitalHashMap = new HashMap<>();


    public List<Doctors> getAllDoctors(int hospitalId){
        return hospitalHashMap.get(hospitalId).getDoctorsList();
    }

    public void addToDataBase(int hospitalId, Hospital hospital){
        hospitalHashMap.put(hospitalId,hospital);
    }

    public List<Hospital> getAllHospitals(){
        List<Hospital> list = new ArrayList<>();
        for(Integer id : hospitalHashMap.keySet()){
            list.add(hospitalHashMap.get(id));
        }
        return list;
    }
}
