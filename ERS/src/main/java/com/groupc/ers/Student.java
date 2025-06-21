/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.groupc.ers;

/**
 *
 * @author micheal
 */


public class Student {
    private String registrationId;
    private String studentName;
    private String faculty;
    private String projectTitle;
    private String contactNumber;
    private String emailAddress;
    private String projectPrototype;

    public Student(String registrationId, String studentName, String faculty, String projectTitle,
                   String contactNumber, String emailAddress, String projectPrototype) {
        this.registrationId = registrationId;
        this.studentName = studentName;
        this.faculty = faculty;
        this.projectTitle = projectTitle;
        this.contactNumber = contactNumber;
        this.emailAddress = emailAddress;
        this.projectPrototype = projectPrototype;
    }

    // Getters and setters

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getProjectPrototype() {
        return projectPrototype;
    }

    public void setProjectPrototype(String projectPrototype) {
        this.projectPrototype = projectPrototype;
    }
}
    

