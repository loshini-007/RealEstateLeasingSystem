package com.realestate;

public class Unit {
    private String unitId;
    private String unitNumber;
    private double rentAmount;
    private boolean occupied = false;

    public Unit(String unitId, String unitNumber, double rentAmount) {
        this.unitId = unitId;
        this.unitNumber = unitNumber;
        this.rentAmount = rentAmount;
    }

    public String getUnitId() { return unitId; }
    public String getUnitNumber() { return unitNumber; }
    public double getRentAmount() { return rentAmount; }
    public boolean isOccupied() { return occupied; }
    public void setOccupied(boolean occupied) { this.occupied = occupied; }

    @Override
    public String toString() {
        return String.format("Unit %s (ID:%s) - Rent: ₹%.2f - %s",
                unitNumber, unitId, rentAmount, occupied ? "Occupied" : "Vacant");
    }
}
