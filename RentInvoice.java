package com.realestate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class RentInvoice {
    private String invoiceId;
    private Lease lease;
    private LocalDate dueDate;
    private double baseAmount;
    private double penaltyAmount = 0.0;
    private boolean paid = false;

    public RentInvoice(String invoiceId, Lease lease, LocalDate dueDate, double baseAmount) {
        this.invoiceId = invoiceId;
        this.lease = lease;
        this.dueDate = dueDate;
        this.baseAmount = baseAmount;
    }

    public String getInvoiceId() { return invoiceId; }
    public Lease getLease() { return lease; }
    public LocalDate getDueDate() { return dueDate; }
    public double getBaseAmount() { return baseAmount; }
    public double getPenaltyAmount() { return penaltyAmount; }
    public boolean isPaid() { return paid; }
    public double getTotal() { return baseAmount + penaltyAmount; }

    public void applyLatePenalty(LocalDate paymentDate) {
        if (paymentDate.isAfter(dueDate)) {
            long monthsLate = ChronoUnit.MONTHS.between(dueDate.withDayOfMonth(1), paymentDate.withDayOfMonth(1));
            if (monthsLate < 1) monthsLate = 1;
            double rate = lease.getLatePenaltyPercentPerMonth() / 100.0;
            penaltyAmount = baseAmount * rate * monthsLate;
        }
    }

    public void markPaid() { this.paid = true; }

    @Override
    public String toString() {
        return String.format("Invoice %s - Lease:%s - Due:%s - Base:₹%.2f - Penalty:₹%.2f - Total:₹%.2f - %s",
                invoiceId, lease.getLeaseId(), dueDate, baseAmount, penaltyAmount, getTotal(), paid ? "PAID" : "DUE");
    }
}
