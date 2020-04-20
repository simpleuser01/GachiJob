package com.example.gachiJob.services;

import com.example.gachiJob.models.Vacancy;
import com.example.gachiJob.repo.VacancyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacancyServiceImpl implements VacancyService{

    @Autowired
    VacancyRepo vacancyRepo;

    @Override
    public void save(Vacancy vacancy) {
        vacancyRepo.save(vacancy);
    }

    @Override
    public void delete(Long id) {
        vacancyRepo.deleteById(id);
    }

    @Override
    public Vacancy update(Vacancy vacancy) {
        return vacancyRepo.saveAndFlush(vacancy);
    }

    @Override
    public Vacancy getById(Long id) {
        return vacancyRepo.getOne(id);
    }

    @Override
    public List<Vacancy> getVacancyList(Long userId) {
        return null;
    }
}
