package com.realestate;

import java.time.LocalDate;
import java.util.*; 

public class RealEstateSystem {
    private Scanner sc = new Scanner(System.in);

    // your data collections
    private Map<String, Property> properties = new LinkedHashMap<>();
    private Map<String, Unit> units = new LinkedHashMap<>();
    private Map<String, Tenant> tenants = new LinkedHashMap<>();
    private Map<String, Lease> leases = new LinkedHashMap<>();
    private Map<String, RentInvoice> invoices = new LinkedHashMap<>();
    private Map<String, Payment> payments = new LinkedHashMap<>();
    private Map<String, MaintenanceRequest> requests = new LinkedHashMap<>();

    public static void main(String[] args) {
        RealEstateSystem app = new RealEstateSystem();
        app.run();  
    }

    public void run() {
        int choice;
        do {
            System.out.println("\n===== Real Estate System Menu =====");
            System.out.println("1. Add Property");
            System.out.println("2. Add Unit");
            System.out.println("3. Add Tenant");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addProperty();
                case 2 -> addUnit();
                case 3 -> addTenant();
                case 4 -> System.out.println("Exiting system...");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 9);
    }

    private void addProperty() {
        System.out.print("Enter Property ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Property Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        Property property = new Property(id, name, address);
        properties.put(id, property);

        System.out.println("✅ Property added successfully!");
    }

    private void addUnit() {
        System.out.print("Enter Unit ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Unit Number: ");
        String number = sc.nextLine();
        System.out.print("Enter Rent Amount: ");
        double rent = sc.nextDouble();
        sc.nextLine();

        Unit unit = new Unit(id, number, rent);
        units.put(id, unit);

        System.out.println("✅ Unit added successfully!");
    }

    private void addTenant() {
        System.out.print("Enter Tenant ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Phone: ");
        String phone = sc.nextLine();
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        Tenant tenant = new Tenant(id, name, phone, email);
        tenants.put(id, tenant);

        System.out.println("✅ Tenant added successfully!");
    }
}
