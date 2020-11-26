package com.avenuecode.personal.baseservice.resource;

import com.avenuecode.personal.baseservice.model.Bill;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@RequestMapping("/base-service/v1")
public interface BillResource {

    @GetMapping("/bill/{id}")
    ResponseEntity<Bill> getBill(@PathVariable Long id);

    @GetMapping("/bill")
    ResponseEntity<Set<Bill>> getAllBills();

    @PostMapping("/bill")
    ResponseEntity<Bill> createBill(@RequestBody Bill bill);

    @PutMapping("/bill/{id}")
    ResponseEntity<Bill> updateBill(@RequestBody Bill bill, @PathVariable Long id);
}
