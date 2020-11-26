package com.avenuecode.personal.baseservice.service;

import com.avenuecode.personal.baseservice.client.DatabaseServiceClient;
import com.avenuecode.personal.baseservice.model.Bill;
import com.avenuecode.personal.baseservice.model.Residence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BillService {

    private DatabaseServiceClient databaseServiceClient;

    @Autowired
    public BillService(DatabaseServiceClient databaseServiceClient) {
        this.databaseServiceClient = databaseServiceClient;
    }

    public Bill getBillById(Long id) {
        Bill bill= databaseServiceClient.getBill(id);
        return bill;
    }

    public Set<Bill> getAllBills() {
        Set<Bill> bills = databaseServiceClient.getAllBills();
        return bills;
    }

    public Bill createBill(Bill bill) {
        Bill response = databaseServiceClient.createBill(bill);
        return response;
    }

    public Bill updateBill(Bill bill, Long id) {
        bill = databaseServiceClient.updateBill(bill, id);
        return bill;
    }
}
