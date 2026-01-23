package com.edutech.progressive.dao;

import com.edutech.progressive.entity.Clinic;

<<<<<<< HEAD
import java.util.List;

public interface ClinicDAO {
    int addClinic(Clinic clinic);
    Clinic getClinicById(int clinicId);
    void updateClinic(Clinic clinic);
    void deleteClinic(int clinicId);
    List<Clinic> getAllClinics();
=======
import java.sql.SQLException;
import java.util.List;

public interface ClinicDAO {
    int addClinic(Clinic clinic) throws SQLException;
    Clinic getClinicById(int clinicId) throws SQLException;
    void updateClinic(Clinic clinic) throws SQLException;
    void deleteClinic(int clinicId) throws SQLException;
    List<Clinic> getAllClinics() throws SQLException;
>>>>>>> 927715866ad88726fdcc804294787c6c83ec4758
}