package com.travel.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "travel_policy")
public class TravelPolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String policyName;

    @Column(length = 1000)
    private String description;

    private Double maxBudget;

    private String allowedClass;

    private Integer maxTripDays;

    private Double perDiemAllowance;

    private Double hotelLimitPerNight;

    private boolean active = true;

    // ================= GETTERS & SETTERS =================

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPolicyName() { return policyName; }
    public void setPolicyName(String policyName) { this.policyName = policyName; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Double getMaxBudget() { return maxBudget; }
    public void setMaxBudget(Double maxBudget) { this.maxBudget = maxBudget; }

    public String getAllowedClass() { return allowedClass; }
    public void setAllowedClass(String allowedClass) { this.allowedClass = allowedClass; }

    public Integer getMaxTripDays() { return maxTripDays; }
    public void setMaxTripDays(Integer maxTripDays) { this.maxTripDays = maxTripDays; }

    public Double getPerDiemAllowance() { return perDiemAllowance; }
    public void setPerDiemAllowance(Double perDiemAllowance) { this.perDiemAllowance = perDiemAllowance; }

    public Double getHotelLimitPerNight() { return hotelLimitPerNight; }
    public void setHotelLimitPerNight(Double hotelLimitPerNight) { this.hotelLimitPerNight = hotelLimitPerNight; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }
}
