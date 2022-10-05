package com.sismics.docs.core.dao.dto;

/**
 * Document DTO.
 *
 * @author bgamard 
 */
public class DocumentDto {
    
    /**
     * Document ID.
     */
    private String id;

    /**
     * Main file ID.
     */
    private String fileId;

    /**
     * Student.
     */
    private String name;
    
    /**
     * AdditionalNotes.
     */
    private String additional_notes;
    
    
    /**
     * Identifier.
     */
    private String identifier;
    
    /**
     * Coverage.
     */
    private String coverage;
    
    /**
     * Rights.
     */
    private String rights;
    
    /**
     * Language.
     */
    private String language;
    
    /**
     * Creation date.
     */
    private Long createTimestamp;
    
    /**
     * Update date.
     */
    private Long updateTimestamp;

    /**
     * Shared status.
     */
    private Boolean shared;

    /**
     * File count.
     */
    private Integer fileCount;
    
    /**
     * Document creator.
     */
    private String creator;

    /**
     * A route is active.
     */
    private boolean activeRoute;

    /**
     * Current route step name.
     */
    private String currentStepName;

    /**
     * Search highlight.
     */
    private String highlight;

    /**
     * Gender.
     */
    private String gender;

    /**
     * Country.
     */
    private String country;

    /**
     * Race.
     */
    private String race;

    /**
     * Email.
     */
    private String email;

    /**
     * Resume.
     */
    private Document resume;

    /**
     * Application date.
     */
    private String creation_date;

    /**
     * gradMajor.
     */
    private String desired_program;

    /**
     * Tags.
     */
    private String tags;

    /**
     * Unergraduate university.
     */
    private String undergrad_univ;

    /**
     * Undergrad major.
     */
    private String major;
    
    /**
     * Undergrad minor.
     */
    private String minor;

    /**
     * GPA.
     */
    private Float gpa;

    /**
     * MCAT .
     */
    private Int mcat;

    /**
     * LSAT.
     */
    private Int lsat;

    /**
     * GRE.
     */
    private Int gre;

    /**
     * GMAT.
     */
    private Int gmat;
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileId() {
        return fileId;
    }

    public DocumentDto setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public String getName() {
        return applicant;
    }

    public void setName(String applicant) {
        this.applicant = applicant;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public String getRights() {
        return rights;
    }

    public void setRights(String rights) {
        this.rights = rights;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

     public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
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

    public void setApplicationDate(String creation_date) {
        this.creation_date = creation_date; 
    }

    public String getApplicationDate() {
        return creation_date; 
    }

    public void setRace(String race) {
        this.race = race; 
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

    public Sring getMajor() {
        return major; 
    }

    public void setMajor(String major) {
        this.major = major; 
    }

    public String getMinor() {
        return minor; 
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }

    public Float getGPA() {
        return gpa; 
    }

    public void setGPA(Float gpa) {
        this.gpa = gpa; 
    }

    public Int getMCAT() {
        return mcat; 
    }

    public void setMCAT(Int mcat) {
        this.mcat = mcat;
    }

    public Int getLSAT() {
        return lsat; 
    }

    public void setLSAT(Int lsat) {
        this.lsat = lsat;
    }

    public Int getGRE() {
        return gre; 
    }

    public void setGRE(Int gre) {
        this.gre = gre;
    }

    public Int getMGAT() {
        return mgat; 
    }

    public void setGMAT(Int gmat) {
        this.gmat = gmat;

    }

    public Integer getFileCount() {
        return fileCount;
    }

    public void setFileCount(Integer fileCount) {
        this.fileCount = fileCount;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public boolean isActiveRoute() {
        return activeRoute;
    }

    public void setActiveRoute(boolean activeRoute) {
        this.activeRoute = activeRoute;
    }

    public String getCurrentStepName() {
        return currentStepName;
    }

    public Long getUpdateTimestamp() {
        return updateTimestamp;
    }

    public void setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }

    public DocumentDto setCurrentStepName(String currentStepName) {
        this.currentStepName = currentStepName;
        return this;
    }

    public String getHighlight() {
        return highlight;
    }

    public DocumentDto setHighlight(String highlight) {
        this.highlight = highlight;
        return this;
    }
}
