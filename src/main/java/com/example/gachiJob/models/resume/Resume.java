package com.example.gachiJob.models.resume;

import com.example.gachiJob.models.user.UserResume;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "resume", schema = "public", catalog = "GachiJobDataSource")
public class Resume {

    @Id
    @Column(name = "resume_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long resumeId;

    @Column(name = "working_experience")
    private short workingExperience;

    @Column(name = "desired_salary")
    private int desiredSalary;

    @Column(name = "foreign_language")
    private String foreignLanguage;

    @Column(name = "driver_license")
    private boolean driverLicense;

    @Column(name = "education")
    private String education;

    @Column(name = "telework")
    private boolean telework;

    @Column(name = "date_of_creation")
    private Timestamp dateOfCreation;

    @Column(name = "extra_information")
    private String extraInformation;

    @Column(name = "resume_name")
    private String resumeName;

    @OneToMany(mappedBy = "resume")
    List<UserResume> userResumes;

    public long getResumeId() {
        return resumeId;
    }

    public void setResumeId(long resumeId) {
        this.resumeId = resumeId;
    }

    public short getWorkingExperience() {
        return workingExperience;
    }

    public void setWorkingExperience(short workingExperience) {
        this.workingExperience = workingExperience;
    }

    public int getDesiredSalary() {
        return desiredSalary;
    }

    public void setDesiredSalary(int desiredSalary) {
        this.desiredSalary = desiredSalary;
    }

    public String getForeignLanguage() {
        return foreignLanguage;
    }

    public void setForeignLanguage(String foreignLanguage) {
        this.foreignLanguage = foreignLanguage;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public boolean isTelework() {
        return telework;
    }

    public void setTelework(boolean telework) {
        this.telework = telework;
    }

    public Timestamp getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Timestamp dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getExtraInformation() {
        return extraInformation;
    }

    public void setExtraInformation(String extraInformation) {
        this.extraInformation = extraInformation;
    }

    public String getResumeName() {
        return resumeName;
    }

    public void setResumeName(String resumeName) {
        this.resumeName = resumeName;
    }

    public List<UserResume> getUserResumes() {
        return userResumes;
    }

    public void setUserResumes(List<UserResume> userResumes) {
        this.userResumes = userResumes;
    }
}
