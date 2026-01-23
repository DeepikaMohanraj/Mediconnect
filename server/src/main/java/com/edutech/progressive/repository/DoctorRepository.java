package com.edutech.progressive.repository;

<<<<<<< HEAD

public interface DoctorRepository {
}
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edutech.progressive.entity.Doctor;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

    Doctor findByDoctorId(int doctorId);
}
>>>>>>> 927715866ad88726fdcc804294787c6c83ec4758
