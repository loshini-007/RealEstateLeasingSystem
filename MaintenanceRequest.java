package com.realestate;

import java.time.LocalDate;

public class MaintenanceRequest {
    public enum Status { OPEN, IN_PROGRESS, CLOSED }

    private String requestId;
    private Unit unit;
    private Tenant tenant;
    private String description;
    private LocalDate requestDate;
    private Status status = Status.OPEN;

    public MaintenanceRequest(String requestId, Unit unit, Tenant tenant,
                              String description, LocalDate requestDate) {
        this.requestId = requestId;
        this.unit = unit;
        this.tenant = tenant;
        this.description = description;
        this.requestDate = requestDate;
    }

    public String getRequestId() { return requestId; }
    public Unit getUnit() { return unit; }
    public Tenant getTenant() { return tenant; }
    public String getDescription() { return description; }
    public LocalDate getRequestDate() { return requestDate; }
    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    @Override
    public String toString() {
        return String.format("Req %s - Unit:%s - Tenant:%s - %s - %s",
                requestId, unit.getUnitNumber(), tenant.getName(), requestDate, status);
    }
}
