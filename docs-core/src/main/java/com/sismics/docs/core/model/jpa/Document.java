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
     * Name
     */
    @Column(name = "DOC_NAME_C", nullable = false, length = 100)
    private String name; 
    
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
    private Date applicationDate; 

    /**
    * Resume.
    */
    @Column(name = "DOC_RESUME_C", nullalbe = false, length = 100)
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
    private String major; 

    /**
     * Undergraduate university. 
     */
    @Column(name = "DOC_UNDERGRAD_UNIV_C", nullalbe = false, length = 100)
    private String undergradUniv; 

    /**
     * Major. 
     */
    @Column(name = "DOC_MAJOR_C", nullable = false, length = 100)
    private String major; 

    /**
     * Major. 
     */
    @Column(name = "DOC_MINOR_C", length = 100)
    private String minotr; 

    /**
     * GPA. 
     */
    @Column(name = "DOC_GPA_C", length = 100)
    private Float GPA; 

    /**
     * MCAT. 
     */
    @Column(name = "DOC_MCAT_C", length = 100)
    private String mcat; 

    /**
     * LSAT. 
     */
    @Column(name = "DOC_LSAT_C", length = 100)
    private String lsat; 

    /**
     * GRE. 
     */
    @Column(name = "DOC_GRE_C", length = 100)
    private String gre; 

    /**
     * GMAT. 
     */
    @Column(name = "DOC_GMAT_C", length = 100)
    private String gmat; 


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
        return name;
    }

    public void setName(String name) {
        this.name = name;

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

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate; 
    }

    public Date getApplicationDate() {
        return applicationDate; 
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
        return gradMajor; 
    }

    public void setGradMajor(String gradMajor) {
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

    public String getMinor() {
        this.minor = minor; 
    }

    public void setMinor(String minor) {
        return minor;
    }

    public Int getMCAT() {
        this.mcat = mcat;
    }

    public void setMCAT(Int mcat) {
        return mcat; 
    }

    public Int getLSAT() {
        this.lsat = lsat;
    }

    public void setLSAT(int lsat) {
        return lsat; 
    }

    public Int getGRE() {
        this.gre = gre;
    }

    public void setGRE(int gre) {
        return gre; 
    }

    public Int getGMAT() {
        this.gmat = gmat;
    }

    public void setGMAT(int gmat) {
        return gmat; 
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
