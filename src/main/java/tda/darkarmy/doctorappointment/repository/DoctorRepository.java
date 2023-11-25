package tda.darkarmy.doctorappointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tda.darkarmy.doctorappointment.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    // Add any custom repository methods if needed
    Doctor findByUserId(Long id);
}

