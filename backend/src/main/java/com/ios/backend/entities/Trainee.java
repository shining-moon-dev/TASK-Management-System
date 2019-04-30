package com.ios.backend.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
/**
 * FIELD COUNT: 10
 * @author Ayushman.Srivastava
 *
 */
@Entity
@Component
public class Trainee {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String password;
  
  @Column(unique = true )
  private String username;
  private String name;
  private String email;
  
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
  private LocalDateTime joinDate;
  private String department;
  private String contacts;
  private String address;
  private String gender;
  private long program;
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LocalDateTime getJoinDate() {
    return joinDate;
  }

  public void setJoinDate(LocalDateTime joinDate) {
    this.joinDate = joinDate;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getContacts() {
    return contacts;
  }

  public void setContacts(String contacts) {
    this.contacts = contacts;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public long getProgram() {
    return program;
  }

  public void setProgram(long program) {
    this.program = program;
  }


}
