package service;

import mobel.Bill;
import java.util.ArrayList;
import java.util.List;

public class BillingService {
    private List<Bill> bills = new ArrayList<>();

    public void addBill(Bill b) {
        bills.add(b);
        System.out.println("Bill recorded.");
    }
}