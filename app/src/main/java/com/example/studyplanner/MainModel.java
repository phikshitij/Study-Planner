package com.example.studyplanner;

public class MainModel {

    String Name, course, email, surl;

    MainModel()
    {


    }
    public MainModel(String name, String course, String email, String surl) {
        Name = name;
        this.course = course;
        this.email = email;
        this.surl = surl;
    }

    public String getSurl() {
        return surl;
    }

    public void setSurl(String surl) {
        this.surl = surl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
