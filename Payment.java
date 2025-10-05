package com.realestate;

import java.time.LocalDate;

public class Payment {
    private String paymentId;
    private RentInvoice invoice;
    private double amount;
    private LocalDate paymentDate;

    public Payment(String paymentId, RentInvoice invoice, double amount, LocalDate paymentDate) {
        this.paymentId = paymentId;
        this.invoice = invoice;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public String getPaymentId() { return paymentId; }
    public RentInvoice getInvoice() { return invoice; }
    public double getAmount() { return amount; }
    public LocalDate getPaymentDate() { return paymentDate; }

    @Override
    public String toString() {
        return String.format("Payment %s - Invoice:%s - Date:%s - Amount:₹%.2f",
                paymentId, invoice.getInvoiceId(), paymentDate, amount);
    }
}
