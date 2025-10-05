package com.realestate;

import java.time.LocalDate;

public class Lease {
    private String leaseId;
    private Tenant tenant;
    private Unit unit;
    private LocalDate startDate;
    private LocalDate endDate;
    private int cycleMonths;
    private double securityDeposit;
    private double latePenaltyPercentPerMonth;

    public Lease(String leaseId, Tenant tenant, Unit unit,
                 LocalDate startDate, LocalDate endDate,
                 int cycleMonths, double securityDeposit, double latePenaltyPercentPerMonth) {
        this.leaseId = leaseId;
        this.tenant = tenant;
        this.unit = unit;
        this.startDate = startDate;
        this.endDate = endDate;
        this.cycleMonths = cycleMonths;
        this.securityDeposit = securityDeposit;
        this.latePenaltyPercentPerMonth = latePenaltyPercentPerMonth;
    }

    public String getLeaseId() { return leaseId; }
    public Tenant getTenant() { return tenant; }
    public Unit getUnit() { return unit; }
    public LocalDate getStartDate() { return startDate; }
    public LocalDate getEndDate() { return endDate; }
    public int getCycleMonths() { return cycleMonths; }
    public double getSecurityDeposit() { return securityDeposit; }
    public double getLatePenaltyPercentPerMonth() { return latePenaltyPercentPerMonth; }

    public void activate() { unit.setOccupied(true); }

    @Override
    public String toString() {
        return String.format("Lease %s - Tenant:%s - Unit:%s - %s to %s",
                leaseId, tenant.getName(), unit.getUnitNumber(), startDate, endDate);
    }
}
