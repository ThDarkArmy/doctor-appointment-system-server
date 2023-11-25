package tda.darkarmy.doctorappointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tda.darkarmy.doctorappointment.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
