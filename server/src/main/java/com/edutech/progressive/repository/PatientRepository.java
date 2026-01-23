package com.edutech.progressive.repository;

<<<<<<< HEAD

public interface PatientRepository {
}
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edutech.progressive.entity.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{

    Patient findByPatientId(int patientId);
}
>>>>>>> 927715866ad88726fdcc804294787c6c83ec4758
