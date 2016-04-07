package com.example.gdev.exceptionproject.dataModel;

import com.backendless.geo.GeoPoint;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by kate on 4/7/16.
 */
public class Listing implements Serializable {
    // Backendless managed attributes
    private String objectId=null;
    private Date created;
    private Date updated;
    // Listing attributes
    private String memberName;
    private String title;
    private String category;
    private int vacancies;
    private String description;
    private String address;
    private String pictureURL;
    private String listingDate;
    private String submissionDate;
    private String submissionTime;
    private String listingTime;
    private GeoPoint location;
    private String uobjectId;
    private String contactInfo;
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public String getObjectId() {
        return objectId;
    }
    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }
    public Date getCreated() {
        return created;
    }
    public void setCreated(Date created) {
        this.created = created;
    }
    public Date getUpdated() {
        return updated;
    }
    public void setUpdated(Date updated) {
        this.updated = updated;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public int getVacancies() {
        return vacancies;
    }
    public void setVacancies(int vacancies) {
        this.vacancies = vacancies;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPictureURL() {
        return pictureURL;
    }
    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }
    public String getListingDate() {
        return listingDate;
    }
    public void setListingDate(String listingDate) {
        this.listingDate = listingDate;
    }
    public String getListingTime() {
        return listingTime;
    }
    public void setListingTime(String listingTime) {
        this.listingTime = listingTime;
    }
    public GeoPoint getLocation() {
        return location;
    }
    public void setLocation(GeoPoint location) {
        this.location = location;
    }
    public String getuObjectId() {
        return uobjectId;
    }
    public void setuObjectId(String uobjectId) {
        this.uobjectId = uobjectId;
    }
    public String getSubmissionDate() {
        return submissionDate;
    }
    public void setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
    }
    public String getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    public String getSubmissionTime() {
        return submissionTime;
    }
    public void setSubmissionTime(String submissionTime) {
        this.submissionTime = submissionTime;
    }
}