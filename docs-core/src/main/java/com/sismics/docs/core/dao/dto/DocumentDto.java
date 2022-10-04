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
    private String student;
    
    /**
     * AdditionalNotes.
     */
    private String additionalNotes;
    
    
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
     * Birthdate.
     */
    private String birthDate;


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
     * Application date.
     */
    private String applicationDate;


    /**
     * gradMajor.
     */
    private String gradMajor;

    /**
     * Tags.
     */
    private String tags;

    /**
     * Unergraduate university.
     */
    private String undergradUniv;

    /**
     * Undergrad major.
     */
    private String major;

    /**
     * GPA.
     */
    private Float GPA;
    

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

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

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

    public String getBirthdate() {
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
