package com.avenuecode.personal.baseservice.controller;

import com.avenuecode.personal.baseservice.model.Residence;
import com.avenuecode.personal.baseservice.resource.ResidenceResource;
import com.avenuecode.personal.baseservice.service.ResidenceService;
import com.avenuecode.personal.baseservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class ResidenceController implements ResidenceResource {

    private ResidenceService residenceService;

    @Autowired
    public ResidenceController(ResidenceService residenceService) {
        this.residenceService = residenceService;
    }

    @Override
    public ResponseEntity<Residence> getResidence(Long id) {
        Residence residence = residenceService.getResidenceById(id);
        return new ResponseEntity<>(residence, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Set<Residence>> getAllResidences() {
        Set<Residence> residences = residenceService.getAllResidences();
        return new ResponseEntity<>(residences, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> createResidence(Residence residence) {
        return new ResponseEntity<>("Residence created. Id=" + residenceService.createResidence(residence), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<String> deleteResidence(Long id) {
        return new ResponseEntity<>(residenceService.deleteResidence(id), HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<Residence> updateResidence(Residence residence, Long id) {
        residence = residenceService.updateResidence(residence, id);
        return new ResponseEntity<>(residence, HttpStatus.OK);
    }
}
