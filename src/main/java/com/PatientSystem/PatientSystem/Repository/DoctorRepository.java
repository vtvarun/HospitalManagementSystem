package com.PatientSystem.PatientSystem.Repository;

import com.PatientSystem.PatientSystem.Doctors;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class DoctorRepository {

    public HashMap<Integer, Doctors> doctorHashMap = new HashMap<>();

    public void addNewDoctor(Doctors doctor){
        doctorHashMap.put(doctor.getDoctorsId(), doctor);
    }

}
