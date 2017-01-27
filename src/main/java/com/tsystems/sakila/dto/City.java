package com.tsystems.sakila.dto;

import lombok.Data;

@Data
public class City {
    private Long id;
    private String city;
    private Long countryId;

}
