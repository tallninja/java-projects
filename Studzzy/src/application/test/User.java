package application.test;

import java.util.Date;

public class User {

    private String name;
    private String university;
    private String yearOfStudy;
    private String regNo;
    private Date semStartDate;
    private Date semEndDate;

    public User(String name, String university, String yearOfStudy, String regNo, Date semStartDate, Date semEndDate) {
        setName(name);
        setUniversity(university);
        setYearOfStudy(yearOfStudy);
        setRegNo(regNo);
        setSemStartDate(semStartDate);
        setSemEndDate(semEndDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public Date getSemStartDate() {
        return semStartDate;
    }

    public void setSemStartDate(Date semStartDate) {
        this.semStartDate = semStartDate;
    }

    public Date getSemEndDate() {
        return semEndDate;
    }

    public void setSemEndDate(Date semEndDate) {
        this.semEndDate = semEndDate;
    }
}
