package com.edutech.progressive.repository;

<<<<<<< HEAD
public interface ClinicRepository {
}
=======
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.edutech.progressive.entity.Clinic;
@Repository
public interface ClinicRepository extends JpaRepository<Clinic, Integer> {

    Clinic findByClinicId(int clinicId);

    List<Clinic> findAllByLocation(String location);

    @Query("SELECT c FROM Clinic c WHERE c.doctor.doctorId = :doctorId")
    List<Clinic> findAllByDoctorId(int doctorId);

    @Transactional
    @Modifying
    @Query ("DELETE FROM Clinic c WHERE c.doctor.doctorId = :doctorId")
    void deleteByDoctorId(int doctorId);

}
>>>>>>> 927715866ad88726fdcc804294787c6c83ec4758
