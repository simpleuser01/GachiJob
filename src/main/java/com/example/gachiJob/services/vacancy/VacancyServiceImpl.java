package com.example.gachiJob.services.vacancy;

import com.example.gachiJob.models.vacancy.Vacancy;
import com.example.gachiJob.repo.vacancy.VacancyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacancyServiceImpl implements com.example.gachiJob.services.Service<Vacancy>{

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
