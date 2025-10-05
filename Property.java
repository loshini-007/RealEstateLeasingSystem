package com.realestate;

import java.util.ArrayList;
import java.util.List;

public class Property {
    private String propertyId;
    private String name;
    private String address;
    private List<Unit> units = new ArrayList<>();

    public Property(String propertyId, String name, String address) {
        this.propertyId = propertyId;
        this.name = name;
        this.address = address;
    }

    public String getPropertyId() { return propertyId; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public List<Unit> getUnits() { return units; }

    public void addUnit(Unit unit) { units.add(unit); }

    @Override
    public String toString() {
        return String.format("%s - %s (%s)", propertyId, name, address);
    }
}
