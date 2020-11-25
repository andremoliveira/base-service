package com.avenuecode.personal.baseservice.controller;

import com.avenuecode.personal.baseservice.model.Bill;
import com.avenuecode.personal.baseservice.resource.BillResource;
import com.avenuecode.personal.baseservice.service.BillService;
import com.avenuecode.personal.baseservice.service.ResidenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.Set;

@Controller
public class BillController implements BillResource {

    private BillService billService;

    @Autowired
    public BillController(BillService billService) {
        this.billService = billService;
    }

    @Override
    public ResponseEntity<Bill> getBill(Long id) {
        Bill bill = billService.getBillById(id);
        return new ResponseEntity<>(bill, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Set<Bill>> getAllBills() {
        Set<Bill> bills = billService.getAllBills();
        return new ResponseEntity<>(bills, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Bill> createBill(Bill bill) {
        bill = billService.createBill(bill);
        return new ResponseEntity<>(bill, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<String> deleteBill(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Bill> updateBill(Bill bill, Long id) {
        return null;
    }
}
