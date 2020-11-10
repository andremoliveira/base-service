package com.avenuecode.personal.baseservice.resource;

import com.avenuecode.personal.baseservice.model.Residence;
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
public interface ResidenceResource {

    @GetMapping("/residence/{id}")
    ResponseEntity<Residence> getResidence(@PathVariable Long id);

    @GetMapping("/residence")
    ResponseEntity<Set<Residence>> getAllResidences();

    @PostMapping("/residence")
    ResponseEntity<String> createResidence(@RequestBody Residence residence);

    @DeleteMapping("/residence/{id}")
    ResponseEntity<String> deleteResidence(@PathVariable Long id);

    @PutMapping("/residence/{id}")
    ResponseEntity<Residence> updateResidence(@RequestBody Residence residence, @PathVariable Long id);
}
