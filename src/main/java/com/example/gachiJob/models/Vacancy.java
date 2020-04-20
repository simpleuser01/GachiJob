package com.example.gachiJob.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "vacancy")
public class Vacancy {

    @Id
    @Column(name = "vacancy_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vacancyId;

    @Column(name = "vacancy_name")
    private String vacancyName;

    @Column(name = "experience")
    private int vacancyExperience;

    @Column(name = "requirements")
    private String[] requirements;

    @Column(name = "salary_offer")
    private int salaryOffer;

    @Column(name = "exhibited_date")
    private LocalDateTime exhibitedDate;

    @Column(name = "status")
    private boolean status;

    @Column(name = "extra_benefits")
    private String[] extraBenefits;

    @Column(name = "date_of_creation")
    private LocalDateTime creationDate;

    @Column(name = "contacts")
    private String contacts;

    public Vacancy() {
    }

    public long getVacancyId() {
        return vacancyId;
    }

    public void setVacancyId(long vacancyId) {
        this.vacancyId = vacancyId;
    }

    public String getVacancyName() {
        return vacancyName;
    }

    public void setVacancyName(String vacancyName) {
        this.vacancyName = vacancyName;
    }

    public int getVacancyExperience() {
        return vacancyExperience;
    }

    public void setVacancyExperience(int vacancyExperience) {
        this.vacancyExperience = vacancyExperience;
    }

    public String[] getRequirements() {
        return requirements;
    }

    public void setRequirements(String[] requirements) {
        this.requirements = requirements;
    }

    public int getSalaryOffer() {
        return salaryOffer;
    }

    public void setSalaryOffer(int salaryOffer) {
        this.salaryOffer = salaryOffer;
    }

    public LocalDateTime getExhibitedDate() {
        return exhibitedDate;
    }

    public void setExhibitedDate(LocalDateTime exhibitedDate) {
        this.exhibitedDate = exhibitedDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String[] getExtraBenefits() {
        return extraBenefits;
    }

    public void setExtraBenefits(String[] extraBenefits) {
        this.extraBenefits = extraBenefits;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }
}
