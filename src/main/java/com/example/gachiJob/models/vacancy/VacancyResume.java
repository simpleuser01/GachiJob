package com.example.gachiJob.models.vacancy;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "vacancy_resume")
public class VacancyResume {

    @Id
    @Column(name = "vacancy_resume_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long vacancyResumeId;

    @Column(name = "vacancy_id_fk")
    private long vacancyIdFk;

    @Column(name = "resume_id_fk")
    private long resumeIdFk;

    @Column(name = "date_of_response")
    private LocalDateTime responseDate;

    @ManyToOne
    @JoinColumn(name = "vacancy_id_fk", referencedColumnName = "vacancy_id", insertable = false, updatable = false)
    Vacancy vacancy;

    //toDO @ManyToOne for resume


    public VacancyResume() {
    }

    public long getVacancyResumeId() {
        return vacancyResumeId;
    }

    public void setVacancyResumeId(long vacancyResumeId) {
        this.vacancyResumeId = vacancyResumeId;
    }

    public long getVacancyIdFk() {
        return vacancyIdFk;
    }

    public void setVacancyIdFk(long vacancyIdFk) {
        this.vacancyIdFk = vacancyIdFk;
    }

    public long getResumeIdFk() {
        return resumeIdFk;
    }

    public void setResumeIdFk(long resumeIdFk) {
        this.resumeIdFk = resumeIdFk;
    }

    public LocalDateTime getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(LocalDateTime responseDate) {
        this.responseDate = responseDate;
    }

    public Vacancy getVacancy() {
        return vacancy;
    }

    public void setVacancy(Vacancy vacancy) {
        this.vacancy = vacancy;
    }


}
