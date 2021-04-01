package com.avenuecode.personal.baseservice.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Residence {

    private Long id;

    private String name;

    private String address;

    private String dateCreation;

    private String dateUpdating;

    private String dateExclusion;

    private Set<User> users;

}
