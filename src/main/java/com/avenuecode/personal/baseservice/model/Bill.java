package com.avenuecode.personal.baseservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Bill {

    private Long id;

    private String description;

    private String dateCreation;

    private String dateUpdating;

    private String paymentDay;

    private String dueDate;

    private User payingUser;

    private Residence residence;
}
