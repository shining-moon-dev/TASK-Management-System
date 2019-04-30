package com.ios.backend.dto;

public class MentorDTO {
  private long id;
  private String username;
  private String name;
  private String email;
  private String department;
  private String contacts;
  private String password;
  private String isAdmin;
  private String profile;
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

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(String isAdmin) {
    this.isAdmin = isAdmin;
  }

  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public long getProgram() {
    return program;
  }

  public void setProgram(long program) {
    this.program = program;
  }

}
