package com.test.test.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_table")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String dob;
    private String gender;
    private String maritalStatus;   
    private String number;   
    private String email;
    private String address;

    public Users() {
    }

    public Users(String name, String dob, String gender, String maritalStatus, String number, String email,
            String address) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.number = number;
        this.email = email;
        this.address = address;
    }

    public Users(Integer id, String name, String dob, String gender, String maritalStatus, String number, String email,
            String address) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.number = number;
        this.email = email;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    
    
}
