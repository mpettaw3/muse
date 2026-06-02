package com.sharetechworks.muse.DOA;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id;
    String title;
    String email;
    String phone_number;
    String city;
    String State;
    String zipcode;


}
