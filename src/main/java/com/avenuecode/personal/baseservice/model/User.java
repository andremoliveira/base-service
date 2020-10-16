package com.avenuecode.personal.baseservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class User {

    private long id;

    private String name;
}
