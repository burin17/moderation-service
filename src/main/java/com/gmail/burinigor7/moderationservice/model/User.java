package com.gmail.burinigor7.moderationservice.model;

import java.util.List;

public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String email;
    private String username;
    private String password;
    private List<FundraisingProject> fundraisingProjects;
    private String walletName;
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    public User() {
    }

    public String getWalletName() {
        return walletName;
    }

    public void setWalletName(String walletName) {
        this.walletName = walletName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public List<FundraisingProject> getFundraisingProjects() {
        return fundraisingProjects;
    }

    public void setFundraisingProjects(List<FundraisingProject> fundraisingProjects) {
        this.fundraisingProjects = fundraisingProjects;
    }
}
