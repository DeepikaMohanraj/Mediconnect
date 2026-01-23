package com.edutech.progressive.dao;

import com.edutech.progressive.entity.Doctor;

<<<<<<< HEAD
import java.util.List;

public interface DoctorDAO {
    int addDoctor(Doctor doctor);
    Doctor getDoctorById(int doctorId);
    void updateDoctor(Doctor doctor);
    void deleteDoctor(int doctorId) ;
    List<Doctor> getAllDoctors();
}
=======
import java.sql.SQLException;
import java.util.List;

public interface DoctorDAO {
    int addDoctor(Doctor doctor) throws SQLException;
    Doctor getDoctorById(int doctorId) throws SQLException;
    void updateDoctor(Doctor doctor) throws SQLException;
    void deleteDoctor(int doctorId) throws SQLException ;
    List<Doctor> getAllDoctors() throws SQLException;
}
>>>>>>> 927715866ad88726fdcc804294787c6c83ec4758
