package com.travel.dto;

import java.time.LocalDate;

public class CreateTravelRequestDTO {

    // =====================================================
    // BASIC DETAILS
    // =====================================================

    private String source;

    private String destination;

    private String purpose;

    // =====================================================
    // TRAVEL DATES
    // =====================================================

    private LocalDate startDate;

    private LocalDate endDate;

    // =====================================================
    // BUDGET
    // =====================================================

    private Double budget;

    // =====================================================
    // TRAVEL DETAILS
    // =====================================================

    private String transportMode;

    private String accommodation;

    // =====================================================
    // STATUS (DRAFT or SUBMITTED)
    // =====================================================

    private String status;

    // =====================================================
    // EXTRA DETAILS
    // =====================================================

    private String description;

    private String documentUrl;

    // =====================================================
    // GETTERS & SETTERS
    // =====================================================

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    public String getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(String accommodation) {
        this.accommodation = accommodation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDocumentUrl() {
        return documentUrl;
    }

    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
