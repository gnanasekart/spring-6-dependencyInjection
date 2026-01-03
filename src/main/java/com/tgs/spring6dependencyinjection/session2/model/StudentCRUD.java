package com.tgs.spring6dependencyinjection.session2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentCRUD {

    private int rollNo;
    private String name;
    private String technology;
}
