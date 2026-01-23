package com.edutech.progressive.service;
<<<<<<< HEAD

import com.edutech.progressive.dto.DoctorDTO;
import com.edutech.progressive.entity.Doctor;

import java.util.List;

public interface DoctorService {

    public List<Doctor> getAllDoctors();

    public Integer addDoctor(Doctor doctor);

    public List<Doctor> getDoctorSortedByExperience();

    default void emptyArrayList() {
    }

    //Do not implement these methods in DoctorServiceImplArraylist.java class
    default public void updateDoctor(Doctor doctor) { }

    default public void deleteDoctor(int doctorId) { }

    default Doctor getDoctorById(int doctorId) { return null; }

    //Do not implement these methods in DoctorServiceImplArraylist.java and DoctorServiceImplJdbc.java class
    // Do not implement this method until day-13
    default public void modifyDoctorDetails(DoctorDTO doctorDTO) { }
=======
 
import com.edutech.progressive.dto.DoctorDTO;
import com.edutech.progressive.entity.Doctor;
 
import java.util.List;
 
public interface DoctorService {
 
    public List<Doctor> getAllDoctors() throws Exception;
 
    public Integer addDoctor(Doctor doctor) throws Exception;
 
    public List<Doctor> getDoctorSortedByExperience() throws Exception;
 
    default void emptyArrayList() {
    }
 
    //Do not implement these methods in DoctorServiceImplArraylist.java class
    default public void updateDoctor(Doctor doctor) throws Exception { }
 
    default public void deleteDoctor(int doctorId) throws Exception { }
 
    default Doctor getDoctorById(int doctorId) throws Exception { return null; }
 
    //Do not implement these methods in DoctorServiceImplArraylist.java and DoctorServiceImplJdbc.java class
    //Do not implement this method until day-13
    default public void modifyDoctorDetails(DoctorDTO doctorDTO) throws Exception { }
>>>>>>> 927715866ad88726fdcc804294787c6c83ec4758
}
