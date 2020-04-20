package com.example.gachiJob.repo.vacancy;

import com.example.gachiJob.models.vacancy.VacancyResume;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacancyResumeRepo extends JpaRepository<VacancyResume, Long> {
}
