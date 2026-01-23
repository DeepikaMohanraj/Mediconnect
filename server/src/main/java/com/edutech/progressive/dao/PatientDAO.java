package com.edutech.progressive.dao;

import com.edutech.progressive.entity.Patient;

<<<<<<< HEAD
import java.util.List;

public interface PatientDAO {
    int addPatient(Patient patient);
    Patient getPatientById(int patientId);
    void updatePatient (Patient patient);
    void deletePatient (int patientId);
    List<Patient> getAllPatients();
=======
import java.sql.SQLException;
import java.util.List;

public interface PatientDAO {
    int addPatient(Patient patient) throws SQLException;
    Patient getPatientById(int patientId) throws SQLException;
    void updatePatient (Patient patient) throws SQLException;
    void deletePatient (int patientId) throws SQLException;
    List<Patient> getAllPatients() throws SQLException;
>>>>>>> 927715866ad88726fdcc804294787c6c83ec4758
}