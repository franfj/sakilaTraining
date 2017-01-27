package com.tsystems.sakila.dto;

import lombok.Data;

@Data
public class Address {

    private Long id;
    private String address;
    private String address2;
    private String district;
    private Long cityId;
    private String postalCode;
    private String phone;
}
