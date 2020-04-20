package com.example.gachiJob.repo.resume;

import com.example.gachiJob.models.resume.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface ResumeRepo extends JpaRepository<Resume, Long> {
}
