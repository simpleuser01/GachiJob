package com.example.gachiJob.services;

import com.example.gachiJob.models.vacancy.Vacancy;

import java.util.List;

public interface Service<T> {

    void save(T obj);
    void delete(Long id);
    Vacancy update(T obj);
    Vacancy getById(Long id);
    List<T> getVacancyList(Long userId);
}
