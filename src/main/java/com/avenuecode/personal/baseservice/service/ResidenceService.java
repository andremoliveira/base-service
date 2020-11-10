package com.avenuecode.personal.baseservice.service;

import com.avenuecode.personal.baseservice.client.DatabaseServiceClient;
import com.avenuecode.personal.baseservice.model.Residence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ResidenceService {

    private DatabaseServiceClient databaseServiceClient;

    @Autowired
    public ResidenceService(DatabaseServiceClient databaseServiceClient) {
        this.databaseServiceClient = databaseServiceClient;
    }

    public Residence getResidenceById(Long id) {
        Residence residence = databaseServiceClient.getResidenceById(id);
        return residence;
    }

    public Set<Residence> getAllResidences() {
        Set<Residence> residences = databaseServiceClient.getAllResidences();
        return residences;
    }

    public String createResidence(Residence residence) {
        String response = databaseServiceClient.createResidence(residence);
        return response;
    }
}
