package com.example.gachiJob.repo.user;

import com.example.gachiJob.models.user.UserResume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserResumeRepo extends JpaRepository<UserResume, Long> {
}
