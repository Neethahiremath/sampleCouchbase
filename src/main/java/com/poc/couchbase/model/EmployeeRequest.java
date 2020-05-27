package com.poc.couchbase.model;

import lombok.Data;

@Data
public class EmployeeRequest {

    private String id;
    private String name;
    private String companyName;

}
