package com.gmail.burinigor7.moderationservice.model;

import java.util.Date;

public class FundraisingProject {
    private Long fundraisingProjectId;
    private String title;
    private FundraisingProjectStatus status;
    private User founder;
    private String contractAddress;
    private String description;
    private Date duration;
    private Float amountGoal;
    private Integer days;
    private Float currentAmount;

    public Float getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(Float currentAmount) {
        this.currentAmount = currentAmount;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Float getAmountGoal() {
        return amountGoal;
    }

    public void setAmountGoal(Float amountGoal) {
        this.amountGoal = amountGoal;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public User getFounder() {
        return founder;
    }

    public void setFounder(User founder) {
        this.founder = founder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FundraisingProjectStatus getStatus() {
        return status;
    }

    public void setStatus(FundraisingProjectStatus status) {
        this.status = status;
    }

    public Long getFundraisingProjectId() {
        return fundraisingProjectId;
    }

    public void setFundraisingProjectId(Long fundraisingProjectId) {
        this.fundraisingProjectId = fundraisingProjectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContractAddress() {
        return contractAddress;
    }

    public void setContractAddress(String contractAddress) {
        this.contractAddress = contractAddress;
    }
}
