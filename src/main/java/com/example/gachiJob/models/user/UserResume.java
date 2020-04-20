package com.example.gachiJob.models.user;

import com.example.gachiJob.models.resume.Resume;

import javax.persistence.*;

@Entity
@Table(name = "user_resume", schema = "public", catalog = "GachiJobDataSource")
public class UserResume {

    @Id
    @Column(name = "user_resume_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userResumeId;

    @Column(name = "user_id_fk")
    private long userIdFk;

    @Column(name = "resume_id_fk")
    private long resumeIdFk;

    @ManyToOne
    @JoinColumn(name = "user_id_fk", referencedColumnName = "user_id",
            insertable = false, updatable = false)
    Resume resume;

    public long getUserResumeId() {
        return userResumeId;
    }

    public void setUserResumeId(long userResumeId) {
        this.userResumeId = userResumeId;
    }

    public long getUserIdFk() {
        return userIdFk;
    }

    public void setUserIdFk(long userIdFk) {
        this.userIdFk = userIdFk;
    }

    public long getResumeIdFk() {
        return resumeIdFk;
    }

    public void setResumeIdFk(long resumeIdFk) {
        this.resumeIdFk = resumeIdFk;
    }

    public Resume getResume() {
        return resume;
    }

    public void setResume(Resume resume) {
        this.resume = resume;
    }
}
