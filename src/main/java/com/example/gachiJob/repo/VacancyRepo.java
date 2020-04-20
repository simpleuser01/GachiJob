package com.example.gachiJob.repo;

import com.example.gachiJob.models.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface VacancyRepo extends JpaRepository<Vacancy, Long> {

}
