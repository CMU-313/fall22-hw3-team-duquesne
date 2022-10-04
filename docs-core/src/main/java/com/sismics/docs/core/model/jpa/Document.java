package com.sismics.docs.core.model.jpa;

import com.google.common.base.MoreObjects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Document entity.
 * 
 * @author bgamard
 */
@Entity
@Table(name = "T_DOCUMENT")
public class Document implements Loggable {
    /**
     * Document ID.
     */
    @Id
    @Column(name = "DOC_ID_C", length = 36)
    private String id;
    
    /**
     * User ID.
     */
    @Column(name = "DOC_IDUSER_C", nullable = false, length = 36)
    private String userId;
    
    /**
     * Main file ID.
     */
    @Column(name = "DOC_IDFILE_C", length = 36)
    private String fileId;

    /**
     * Language (ISO 639-9).
     */
    @Column(name = "DOC_LANGUAGE_C", nullable = false, length = 3)
    private String language;
    
    /**
     * Student.
     */
    @Column(name = "DOC_STUDENT_C", nullable = false, length = 100)
    private String student;
    
    /**
     * Additional notes.
     */
    @Column(name = "DOC_ADDITIONALNOTES_C", length = 4000)
    private String additionalNotes;

    /**
     * Creation date.
     */
    @Column(name = "DOC_UPDATEDATE_D", nullable = false)
    private Date updateDate;

    /**
     * Deletion date.
     */
    @Column(name = "DOC_DELETEDATE_D")
    private Date deleteDate;

    /**
     * BirthDate. 
     */
    @Column(name = "DOC_BIRTHDATE_C", nullable = false)
    private String birthdate; 

    /**
     * Gender. 
     */
    @Column(name = "DOC_GENDER_C", length = 100)
    private String gender; 

    /**
     * State. 
     */
    @Column(name = "DOC_STATE_C", length = 100)
    private String state; 

    /**
     * Country. 
     */
    @Column(name = "DOC_COUNTRY_C", length = 100)
    private String country; 

    /**
     * Race. 
     */
    @Column(name = "DOC_RACE_C", length = 100)
    private String race; 

    /**
    * Application Date.
    */
    @Column(name = "DOC_APPLICATION_DATE_D", length = 100)
    private Date applicationDate; 

    /**
     * Major. 
     */
    @Column(name = "DOC_GRADMAJOR_C", length = 100)
    private String major; 

    /**
     * Additional files. 
     */
    @Column(name = "DOC_ADDITIONAL_FILES_C", length = 100)
    private String additionalFiles; 

    /**
     * Tags. 
     */
    @Column(name = "DOC_TAGS_C", length = 100)
    private String tags; 

    /**
     * Undergraduate university. 
     */
    @Column(name = "DOC_UNDERGRAD_UNIV_C", length = 100)
    private String undergradUniv; 

    /**
     * Major. 
     */
    @Column(name = "DOC_MAJOR_C", length = 100)
    private String major; 

    /**
     * Major. 
     */
    @Column(name = "DOC_SHARED_C", length = 100)
    private String shared; 

    /**
     * GPA. 
     */
    @Column(name = "DOC_GPA_C", length = 100)
    private Float GPA; 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFileId() {
        return fileId;
    }

    public Document setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    public String getAddtionalFiles() {
        return additionalFiles;
    }

    public void setAdditionalFiles(String additionalFiles) {
        this.additionalFiles = additionalFiles;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate; 
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender; 
    }

    public String getState() {
        return state; 
    }

    public void setState(String state) {
        this.state = state; 
    }

    public String getCountry() {
        return country; 
    }

    public void setCountry(String country) {
        this.country = country; 
    }

    public String getRace() {
        return race; 
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate; 
    }

    public String getApplicationDate() {
        return applicationDate; 
    }

    public void setRace(String race) {
        this.race = race; 
    }

    public String getGradMajor() {
        return gradMajor; 
    }

    public void setGradMajor() {
        this.gradMajor = gradMajor; 
    }

    public String getUndergradUniv() {
        return undergradUniv; 
    }

    public void setUndergradUniv(String undergradUniv) { 
        this.undergradUniv = undergradUniv; 
    }

    public Sring getMajor() {
        return major; 
    }

    public void setMajor(String major) {
        this.major = major; 
    }

    public Float getGPA() {
        return gpa; 
    }

    public void setGPA(String gpa) {
        this.gpa = gpa; 
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getShared() {
        return shared;
    }

    public void setShared(String shared) {
        this.shared = shared;
    }

    public String getCoverage() {
        return coverage;
    }

    public void setCoverage(String coverage) {
        this.coverage = coverage;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .toString();
    }

    @Override
    public String toMessage() {
        return title;
    }
}
