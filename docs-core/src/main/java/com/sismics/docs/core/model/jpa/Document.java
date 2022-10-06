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
     * document.
     */
    @Column(name = "DOC_DOCUMENT_C", nullable = false, length = 36)
    private Date document;
    
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
     * Name
     */
    @Column(name = "DOC_NAME_C", nullable = false, length = 100)
    private String applicant; 
    
    /**
     * Additional notes.
     */
    @Column(name = "DOC_ADDITIONAL_NOTES_C", length = 4000)
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
     * Gender. 
     */
    @Column(name = "DOC_GENDER_C", length = 100)
    private String gender; 

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
     * Email 
     */
    @Column(name = "DOC_EMAIL_C", nullable = false, length = 100)
    private String email;

    /**
    * Application Date.
    */
    @Column(name = "DOC_APPLICATION_DATE_D", nullable = false, length = 100)
    private Date creation_date; 

    /**
    * Resume.
    */
    @Column(name = "DOC_RESUME_C", nullable = false, length = 100)
    private Document resume; 

    /**
     * Tags. 
     */
    @Column(name = "DOC_TAGS_C", length = 100)
    private String tags; 

    /**
     * Major. 
     */
    @Column(name = "DOC_GRADMAJOR_C", nullable = false, length = 100)
    private String desired_program; 

    /**
     * Undergraduate university. 
     */
    @Column(name = "DOC_UNDERGRAD_UNIV_C", nullable = false, length = 100)
    private String undergrad_univ; 

    /**
     * Major. 
     */
    @Column(name = "DOC_MAJOR_C", nullable = false, length = 100)
    private String major; 

    /**
     * Major. 
     */
    @Column(name = "DOC_MINOR_C", length = 100)
    private String minor; 

    /**
     * GPA. 
     */
    @Column(name = "DOC_GPA_C", length = 100)
    private Float gpa; 

    /**
     * MCAT. 
     */
    @Column(name = "DOC_MCAT_C", length = 100)
    private Integer mcat; 

    /**
     * LSAT. 
     */
    @Column(name = "DOC_LSAT_C", length = 100)
    private Integer lsat; 

    /**
     * GRE. 
     */
    @Column(name = "DOC_GRE_C", length = 100)
    private Integer gre; 

    /**
     * GMAT. 
     */
    @Column(name = "DOC_GMAT_C", length = 100)
    private Integer gmat; 


    /**
     * shared. 
     */
    @Column(name = "DOC_SHARED_C", length = 100)
    private String shared; 

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

    public String getName() {
        return applicant;
    }

    public void setName(String applicant) {
        this.applicant = applicant;

    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender; 
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

    public void setRace(String race) {
        this.race = race; 
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email; 
    }

    public void setApplicationDate(Date creation_date) {
        this.creation_date = creation_date; 
    }

    public Date getApplicationDate() {
        return creation_date; 
    }

    public Document getResume() {
        return resume;
    }

    public void setResume(Document resume) {
        this.resume = resume; 
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getGradMajor() {
        return desired_program; 
    }

    public void setGradMajor(String desired_program) {
        this.desired_program = desired_program; 
    }

    public String getUndergradUniv() {
        return undergrad_univ; 
    }

    public void setUndergradUniv(String undergrad_univ) { 
        this.undergrad_univ = undergrad_univ; 
    }

    public String getMajor() {
        return major; 
    }

    public void setMajor(String major) {
        this.major = major; 
    }

    public Float getGPA() {
        return gpa; 
    }

    public void setGPA(Float gpa) {
        this.gpa = gpa; 
    }

    public String getMinor() {
        return minor;  
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public Integer getMCAT() {
        return mcat; 
    }

    public void setMCAT(Integer mcat) {
        this.mcat = mcat; 
    }

    public Integer getLSAT() {
        return lsat; 
    }

    public void setLSAT(Integer lsat) {
        this.lsat = lsat; 
    }

    public Integer getGRE() {
        return gre;
    }

    public void setGRE(Integer gre) {
        this.gre = gre;
    }

    public Integer getGMAT() {
        return gmat; 
    }

    public void setGMAT(Integer gmat) {
       this.gmat = gmat;
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

    public Date getDocument() {
        return document;
    }

    public void setDocument(Date document) {
        this.document = document;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .toString();
    }

    @Override
    public String toMessage() {
        return applicant;
    }
}
