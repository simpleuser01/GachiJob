package com.example.gachiJob.repo.user;

import com.example.gachiJob.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserRepo extends JpaRepository<User, Long> {
}
