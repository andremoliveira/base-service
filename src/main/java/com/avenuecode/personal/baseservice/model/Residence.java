package com.avenuecode.personal.baseservice.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Residence {

    private Long id;

    private String name;

    private String address;

    private String dateCreation;

    private String dateUpdating;

    private String dateExclusion;

    private Set<User> users;

}
