package com.example.gachiJob.services;

import com.example.gachiJob.models.Vacancy;

import java.util.List;

public interface VacancyService {

    void save(Vacancy vacancy);
    void delete(Long id);
    Vacancy update(Vacancy vacancy);
    Vacancy getById(Long id);
    List<Vacancy> getVacancyList(Long userId);
}
