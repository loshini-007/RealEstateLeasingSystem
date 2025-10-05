package com.realestate;

public class Tenant {
    private String tenantId;
    private String name;
    private String phone;
    private String email;

    public Tenant(String tenantId, String name, String phone, String email) {
        this.tenantId = tenantId;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getTenantId() { return tenantId; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return String.format("%s (ID:%s) - %s / %s", name, tenantId, phone, email);
    }
}
