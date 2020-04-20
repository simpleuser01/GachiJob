package com.example.gachiJob.repo.vacancy;

import com.example.gachiJob.models.vacancy.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface VacancyRepo extends JpaRepository<Vacancy, Long> {

        //toDO method getAllVacancyList(Long userId)


}
